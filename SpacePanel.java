import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.net.URL;
import java.util.*;
import javax.swing.*;
import javax.imageio.*;

public class SpacePanel extends JPanel implements Runnable, KeyListener {
	public final static int width = 800;
	public final static int height = 600;

	private boolean running, waveStart;
	private BufferedImage image, lifeImg;
	private double averageFps;
	private Graphics2D g;
	private int fps = 30, waveDelay = 2000, limitLevel = 12;
	private int waveNumber;
	private long waveStartTimer, waveStartTimerDiff;
	private Thread thread;

	public static Player player;
	public static ArrayList <Bullet> bullets;
	public static ArrayList <Enemy> enemies;
	public static ArrayList <PowerUp> powerUps;
	public static ArrayList <Explosion> explosions;
	public static ArrayList <Text> texts;

	public SpacePanel () {
		super();
		setPreferredSize(new Dimension(width, height));
		setFocusable(true);
		requestFocus();
	}
	public void addNotify () {
		super.addNotify();

		//		Thread to start our game
		if (thread == null) {
			thread = new Thread(this);
			thread.start();
		}

		addKeyListener(this);
	}

	//		Loading image
	public BufferedImage loadImg (String urlName) {
		try {
			URL url = getClass().getResource(urlName);
			BufferedImage img = ImageIO.read(url);
			System.out.println(getClass().getResource(urlName));
			return img;
		} catch (Exception e) {
			System.out.println("Error " + e.getMessage());
			return null;
		}
	}

	//		Runnable methods
	public void run () {
		running = true;

		if (lifeImg == null) lifeImg = loadImg ("/img/hero/hero-up-transp.png");
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		g = (Graphics2D) image.getGraphics();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

		player = new Player();
		bullets = new ArrayList<Bullet>();
		enemies = new ArrayList<Enemy>();
		powerUps = new ArrayList<PowerUp>();
		explosions = new ArrayList<Explosion>();
		texts = new ArrayList<Text>();

		waveStartTimer = 0;
		waveStartTimerDiff = 0;
		waveStart = true;
		waveNumber = 0;

		long startTime ;
		long URDTimeMillis;
		long waitTime = 0;
		long totalTime = 0;
		long targetTime = 1000 / fps;

		int frameCount = 0;
		int maxFrameCount = 30;

		//		
		while (running) {
			startTime = System.nanoTime();

			gameUpdate();
			gameRender();
			gameDraw();

			URDTimeMillis = (System.nanoTime() - startTime) / 1000000;
			waitTime = targetTime - URDTimeMillis;
			try {
				Thread.sleep(waitTime);
			} catch (Exception ex) {
				totalTime += System.nanoTime() - startTime;
				frameCount++;
				if (frameCount == maxFrameCount) {
					averageFps = 1000 / ((totalTime / frameCount) / 1000000);
					frameCount = 0;
					totalTime = 0;
				}
			}
		}

		//		Game over message
		g.setColor(new Color(0, 100, 255));
		g.fillRect(0, 0, width, height);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		String s = "Game over";
		int length = (int) g.getFontMetrics().getStringBounds(s, g).getWidth();
		g.drawString(s, (width - length) / 2, height / 2);
		String score = "Total score: " + player.getScore();
		g.drawString(score, (width - length) / 2, height / 2 + 50);
		gameDraw();
	}

	private void createNewEnemies () {
		enemies.clear();
		Enemy e;

		if (waveNumber >= 1 && waveNumber <= 4) {
			for (int i = 0; i < waveNumber; i++) 
				enemies.add(new Enemy(1, 1));
			for (int i = 0; i < 3; i++) 
				enemies.add(new Enemy(1, waveNumber));
		}
		if (waveNumber >= 5 && waveNumber <= 8) {
			for (int i = 0; i < 5; i++) 
				enemies.add(new Enemy(2, 1));
			for (int i = 0; i < 3; i++) 
				enemies.add(new Enemy(2, (waveNumber - 4)));
		}
		if (waveNumber >= 9 && waveNumber <= 12) {
			for (int i = 0; i < 7; i++) 
				enemies.add(new Enemy(3, 1));
			for (int i = 0; i < 2; i++) 
				enemies.add(new Enemy(3, (waveNumber - 8)));
		} else
		if (waveNumber > limitLevel)
			running = false;
	}

	//		----------------------Methods game, update, render, draw
	private void gameUpdate() {
		if (waveStartTimer == 0 && enemies.size() == 0) {
			waveNumber++;
			waveStart = false;
			waveStartTimer = System.nanoTime();
		} else {
			waveStartTimerDiff = (System.nanoTime() - waveStartTimer) / 1000000;
			if (waveStartTimerDiff > waveDelay) {
				waveStart = true;
				waveStartTimer = 0;
				waveStartTimerDiff = 0;
			}
		}

		//		The badass enemies
		if (waveStart && enemies.size() == 0) 
			createNewEnemies();
		
		player.update();

		//		----------------Removing elements
		//		removing bullets
		for (int i = 0; i < bullets.size(); i++) {
			boolean remove = bullets.get(i).update();
			if (remove) {
				bullets.remove(i);
				i--;
			}
		}
		//		explosions update
		for (int i = 0; i < explosions.size(); i++) {
			boolean remove = explosions.get(i).update();
			if (remove) {
				explosions.remove(i);
				i--;
			}
		}
		//		Powerup update
		for (int i = 0; i < powerUps.size(); i++) {
			boolean remove = powerUps.get(i).update();
			if (remove) {
				powerUps.remove(i);
				i--;
			}
		}
		//		Text update
		for (int i = 0; i < texts.size(); i++) {
			boolean remove = texts.get(i).update();
			if (remove) {
				texts.remove(i);
				i--;
			}
		}
		//		Enemy update
		for (int i = 0; i < enemies.size(); i++) 
			enemies.get(i).update();

		for (int i = 0; i < bullets.size(); i++) {
			Bullet b = bullets.get(i);
			double bx = b.getX();
			double by = b.getY();
			double br = b.getR();
			for (int j = 0; j < enemies.size(); j++) {
				Enemy e = enemies.get(j);
				double ex = e.getX();
				double ey = e.getY();
				double er = e.getR();

				double dx = bx - ex;
				double dy = by - ey;

				double dist = Math.sqrt(dx * dx + dy * dy);

				//		Killing faggots enemies
				if (dist < br + er) {
					e.hit();
					bullets.remove(i);
					i--;
					break;
				}
			}
		}

		//		Player dead
		if (player.isDead()) {
			running = false;
		}

		//		Print dead enemies
		for (int i = 0; i < enemies.size(); i++) {
			if (enemies.get(i).isDead()) {
				Enemy e = enemies.get(i);

				//		Chance for powerup
				double rand = Math.random();
				if (rand < 0.010) 
					powerUps.add(new PowerUp(1, e.getX(), e.getY()));
				else
				if (rand < 0.100) 
					powerUps.add(new PowerUp(2, e.getX(), e.getY()));
				else
				if (rand < 0.130) 
					powerUps.add(new PowerUp(3, e.getX(), e.getY()));

				player.setScore(e.getType() + e.getRank());
				enemies.remove(i);
				i--;

				e.explode();
				explosions.add(new Explosion(e.getX(), e.getY(), e.getR(), e.getR() + 30));
			}
		}

		//		Colision
		if (!player.isRecovering()) {
			int px = player.getX();
			int py = player.getY();
			int pr = player.getR();
			for (int i = 0; i < enemies.size(); i++) {
				Enemy e = enemies.get(i);
				double ex = e.getX();
				double ey = e.getY();
				double er = e.getR();

				double dx = px - ex;
				double dy = py - ey;
				double dist = Math.sqrt(dx * dx + dy * dy);

				if (dist < pr + er) 
					player.loseLife();
			}
		}

		//		Player powerup collision
		int px = player.getX();
		int py = player.getY();
		int pr = player.getR();
		for (int i = 0; i < powerUps.size(); i++) {
			PowerUp p = powerUps.get(i);
			double x = p.getX();
			double y = p.getY();
			double r = p.getR();
			double dx = px - x;
			double dy = py - y;
			double dist = Math.sqrt(dx * dx + dy * dy);

			if (dist < pr + r) {
				int type = p.getType();
				if (type == 1) {
					player.setLife(player.getLives() + 1);
					texts.add(new Text(player.getX(), player.getY(), 2000, "Life +1"));
				}
				if (type == 2) {
					player.increasePower(1);
					texts.add(new Text(player.getX(), player.getY(), 2000, "Power +1"));
				}
				if (type == 3) {
					player.increasePower(2);
					texts.add(new Text(player.getX(), player.getY(), 2000, "Power +2"));
				}

				powerUps.remove(i);
				i--;
			}
		}
	}
	private void gameRender() {
		//		Drawing da background of our game
		g.setColor(new Color(0, 100, 240));
		g.fillRect(0, 0, width, height);

		//		Our hero
		player.draw(g);

		//		------------------Drawing the elements
		//		Drawing da bullets
		for (int i = 0; i < bullets.size(); i++) 
			bullets.get(i).draw(g);
		//		Drawing da anemies
		for (int i = 0; i < enemies.size(); i++) 
			enemies.get(i).draw(g);
		//		Draw powers
		for (int i = 0; i < powerUps.size(); i++) 
			powerUps.get(i).draw(g);
		//		Explosions
		for (int i = 0; i < explosions.size(); i++) 
			explosions.get(i).draw(g);
		//		Draw text
		for (int i = 0; i < texts.size(); i++) 
			texts.get(i).draw(g);

		//		Wave number
		if (waveStartTimer != 0 && waveNumber <= limitLevel) {
			g.setFont(new Font("Century Gothic", Font.PLAIN, 20));
			String s = "-Level " + waveNumber + ", good luck";
			int length = (int) g.getFontMetrics().getStringBounds(s, g).getWidth();
			//int alpha = (int) (255 * Math.sin(Math.PI * waveStartTimerDiff / waveDelay));
			//if (alpha > 255) alpha = 255;
			g.setColor(new Color(255, 255, 255, 128));
			g.drawString(s, width / 2 - length, height / 2);
		}

		//		Drawing player power
		g.setColor(Color.YELLOW);
		g.fillRect(20, 60, player.getPower() * 8, 8);
		g.setColor(Color.YELLOW.darker());
		g.setStroke(new BasicStroke(3));
		for (int i = 0; i < player.getRequiredPower(); i++)
			g.drawRect(20 + 8 * i, 60, 8, 8);
		g.setStroke(new BasicStroke(1));

		//		Player lives
		for (int i = 0; i < player.getLives(); i++) 
			g.drawImage(lifeImg, 25 + (35 * i), 20, 30, 30, null);

		//		Player score
		g.setColor(Color.WHITE);
		g.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		g.drawString("Score: " + player.getScore(), width - 100, 30);
		//		Showing level number
		g.setColor(Color.WHITE);
		g.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		g.drawString("Level: " + waveNumber, width - 170, 30);
	}
	private void gameDraw() {
		Graphics g2 = this.getGraphics();
		g2.drawImage(image, 0, 0, null);
		g2.dispose();
	}

	//		KeyListener methods
	public void keyPressed (KeyEvent e) {
		int keyCode = e.getKeyCode();

		if (keyCode == 27) System.exit(0);
		if (keyCode == KeyEvent.VK_LEFT) player.setLeft(true);
		if (keyCode == KeyEvent.VK_RIGHT) player.setRigth(true);
		if (keyCode == KeyEvent.VK_UP) player.setUp(true);
		if (keyCode == KeyEvent.VK_DOWN) player.setDown(true);
		if (keyCode == KeyEvent.VK_Z || keyCode == 32) player.setFiring(true);
	}
	public void keyReleased (KeyEvent e) {
		int keyCode = e.getKeyCode();

		if (keyCode == 27) System.exit(0);
		if (keyCode == KeyEvent.VK_LEFT) player.setLeft(false);
		if (keyCode == KeyEvent.VK_RIGHT) player.setRigth(false);
		if (keyCode == KeyEvent.VK_UP) player.setUp(false);
		if (keyCode == KeyEvent.VK_DOWN) player.setDown(false);
		if (keyCode == KeyEvent.VK_Z || keyCode == 32) player.setFiring(false);
	}
	public void keyTyped (KeyEvent e) {}
}