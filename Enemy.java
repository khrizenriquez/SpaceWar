import java.awt.*;
import java.awt.image.*;
import java.net.URL;
import javax.imageio.*;

public class Enemy {
	private boolean ready, dead, hit;
	private Color color;
	private BufferedImage bd1, bd2, bd3, bd4, bd5, bd6, bd7, bd8, bd9, image;
	private double x, y, dx, dy, rad, speed;
	private int r, health, type, rank;
	private long hitTimer;

	public Enemy (int type, int rank) {
		this.type = type;
		this.rank = rank;

		//		BadAss types and ranks
		if (type == 1) {
			if (bd1 == null) bd1 = new Generals().loadImg("/img/badass/badAss_1.png");
			if (rank == 1) {
				speed = 3;
				r = 15;
				health = 1;
			}
			if (rank == 2) {
				speed = 3;
				r = 20;
				health = 2;
			}
			if (rank == 3) {
				speed = 1.5;
				r = 25;
				health = 3;
			}
			if (rank == 4) {
				speed = 1.5;
				r = 30;
				health = 5;
			}
			image = bd1;
		}
		if (type == 2) {
			if (bd2 == null) bd2 = new Generals().loadImg("/img/badass/badAss_2.png");
			if (rank == 1) {
				speed = 3;
				r = 15;
				health = 2;
			}
			if (rank == 2) {
				speed = 3;
				r = 25;
				health = 3;
			}
			if (rank == 3) {
				speed = 2.5;
				r = 30;
				health = 3;
			}
			if (rank == 4) {
				speed = 2.5;
				r = 40;
				health = 4;
			}
			image = bd2;
		}
		if (type == 3) {
			if (bd3 == null) bd3 = new Generals().loadImg("/img/badass/badAss_3.png");
			if (rank == 1) {
				speed = 1.5;
				r = 15;
				health = 5;
			}
			if (rank == 2) {
				speed = 1.5;
				r = 25;
				health = 6;
			}
			if (rank == 3) {
				speed = 1.5;
				r = 30;
				health = 7;
			}
			if (rank == 4) {
				speed = 1.5;
				r = 40;
				health = 8;
			}
			image = bd3;
		}
		if (type == 4) {
			if (bd4 == null) bd4 = new Generals().loadImg("/img/badass/badAss_4.png");
			if (rank == 1) {
				speed = 2;
				r = 15;
				health = 1;
			}
			if (rank == 2) {
				speed = 2;
				r = 25;
				health = 3;
			}
			if (rank == 3) {
				speed = 2;
				r = 30;
				health = 4;
			}
			if (rank == 4) {
				speed = 2;
				r = 40;
				health = 8;
			}
			image = bd4;
		}
		if (type == 5) {
			if (bd5 == null) bd5 = new Generals().loadImg("/img/badass/badAss_5.png");
			if (rank == 1) {
				speed = 1.5;
				r = 15;
				health = 5;
			}
			if (rank == 2.5) {
				speed = 2;
				r = 25;
				health = 6;
			}
			if (rank == 3) {
				speed = 2;
				r = 30;
				health = 7;
			}
			if (rank == 4) {
				speed = 3;
				r = 40;
				health = 3;
			}
			image = bd5;
		}
		if (type == 6) {
			if (bd6 == null) bd6 = new Generals().loadImg("/img/badass/badAss_6.png");
			if (rank == 1) {
				speed = 1;
				r = 15;
				health = 7;
			}
			if (rank == 2) {
				speed = 1.5;
				r = 25;
				health = 8;
			}
			if (rank == 3) {
				speed = 1.5;
				r = 30;
				health = 9;
			}
			if (rank == 4) {
				speed = 1.5;
				r = 40;
				health = 10;
			}
			image = bd6;
		}
		if (type == 7) {
			if (bd7 == null) bd7 = new Generals().loadImg("/img/badass/badAss_7.png");
			if (rank == 1) {
				speed = 3;
				r = 15;
				health = 2;
			}
			if (rank == 2) {
				speed = 3;
				r = 25;
				health = 5;
			}
			if (rank == 3) {
				speed = 2.5;
				r = 30;
				health = 6;
			}
			if (rank == 4) {
				speed = 1;
				r = 40;
				health = 15;
			}
			image = bd7;
		}
		if (type == 8) {
			if (bd8 == null) bd8 = new Generals().loadImg("/img/badass/badAss_8.png");
			if (rank == 1) {
				speed = 1;
				r = 15;
				health = 10;
			}
			if (rank == 2) {
				speed = 1;
				r = 25;
				health = 12;
			}
			if (rank == 3) {
				speed = 1;
				r = 30;
				health = 14;
			}
			if (rank == 4) {
				speed = 1;
				r = 40;
				health = 16;
			}
			image = bd8;
		}
		if (type == 9) {
			if (bd9 == null) bd9 = new Generals().loadImg("/img/badass/badAss_9.png");
			if (rank == 1) {
				speed = 2.5;
				r = 15;
				health = 8;
			}
			if (rank == 2) {
				speed = 2.5;
				r = 25;
				health = 10;
			}
			if (rank == 3) {
				speed = 2.5;
				r = 30;
				health = 15;
			}
			if (rank == 4) {
				speed = 3.5;
				r = 40;
				health = 15;
			}
			image = bd9;
		}

		x = Math.random() * SpacePanel.width / 2 + SpacePanel.width / 4;
		y = -r;

		double angle = Math.random() * 140 + 20;
		rad = Math.toRadians(angle);

		dx = Math.cos(rad) * speed;
		dy = Math.sin(rad) * speed;

		ready = false;
		dead = false;
		hit = false;
		hitTimer = 0;
	}

	//		Setters
	//		Getters
	public double getX () {return x;}
	public double getY () {return y;}
	public int getR () {return r;}
	public boolean isDead () {return dead;}
	public int getType () {return type;}
	public int getRank () {return rank;}

	//		General methods
	public void explode () {
		if (rank > 1) {
			int amount = 0;
			if (type == 1) amount = 2;
			if (type == 2) amount = 3;
			if (type == 3) amount = 4;
			if (type == 4) amount = 5;
			if (type == 5) amount = 6;
			if (type == 6) amount = 8;
			if (type == 7) amount = 6;
			if (type == 8) amount = 5;
			if (type == 9) amount = 3;

			for (int i = 0; i < amount; i++) {
				Enemy e = new Enemy(getType(), getRank() - 1);
				e.x = this.x;
				e.y = this.y;
				double angle = 0;

				if (!ready) angle = Math.random() * 140 + 20;
				else angle = Math.random() * 360;

				e.rad = Math.toRadians(angle);
				SpacePanel.enemies.add(e);
			}
		}
	}
	public void hit () {
		health--;
		if (health <= 0) dead = true;
		hit = true;
		hitTimer = System.nanoTime();
	}

	//		Render methods
	public void update () {
		x += dx;
		y += dy;

		if (!ready) 
			if (x > r && x < SpacePanel.width - r && y > r && y < SpacePanel.height - r) 
				ready = true;

		//		Bounce
		if (x < r && dx < 0) dx = -dx;
		if (y < r && dy < 0) dy = -dy;
		if (x > SpacePanel.width - r && dx > 0) dx = -dx;
		if (y > SpacePanel.height - r && dy > 0) dy = -dy;

		if (hit) {
			long elapsed = (System.nanoTime() - hitTimer) / 1000000;
			if (elapsed > 50) {
				hit = false;
				hitTimer = 0;
			}
		}
	}
	public void draw (Graphics2D g) {
		g.drawImage(image, (int) (x - r), (int) (y - r), (int) (r * 2), (int) (r * 1.7), null);
	}
}