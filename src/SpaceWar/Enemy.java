package SpaceWar;

import java.awt.*;
import java.awt.image.*;
import java.net.URL;
import javax.imageio.*;
import java.awt.image.*;
import java.net.URL;
import javax.imageio.*;

public class Enemy extends Generals {
	private boolean ready, dead, hit;
	private Color color;
	private BufferedImage enemyT1, enemyT1Large, enemyT1Mini, enemyT1Medium;
	private BufferedImage enemyT2, enemyT2Large, enemyT2Mini, enemyT2Medium;
	private BufferedImage enemyT3, enemyT3Large, enemyT3Mini, enemyT3Medium;
	private BufferedImage enemyT1Trans, enemyT1LargeTrans, enemyT1MiniTrans, enemyT1MediumTrans;
	private BufferedImage enemyT2Trans, enemyT2LargeTrans, enemyT2MiniTrans, enemyT2MediumTrans;
	private BufferedImage enemyT3Trans, enemyT3LargeTrans, enemyT3MiniTrans, enemyT3MediumTrans;
	private BufferedImage image;
	private double x, y, dx, dy, rad, speed;
	private int r, health, type, rank;
	private long hitTimer;

	public Enemy (int type, int rank) {
		this.type = type;
		this.rank = rank;

		if (enemyT1Mini == null) enemyT1Mini = loadImg ("/img/badass/badass1Mini.png");
		if (enemyT1Medium == null) enemyT1Medium = loadImg ("/img/badass/badass1Medium.png");
		if (enemyT1 == null) enemyT1 = loadImg ("/img/badass/badass1.png");
		if (enemyT1Large == null) enemyT1Large = loadImg ("/img/badass/badass1Large.png");
		//		------------------------------transparency badass 1
		if (enemyT1Trans == null) enemyT1Trans = loadImg ("/img/badass/transparency/badass1-transp.png");
		if (enemyT1LargeTrans == null) enemyT1LargeTrans = loadImg ("/img/badass/transparency/badass1Large-transp.png");
		if (enemyT1MiniTrans == null) enemyT1MiniTrans = loadImg ("/img/badass/transparency/badass1Mini-transp.png");
		if (enemyT1MediumTrans == null) enemyT1MediumTrans = loadImg ("/img/badass/transparency/badass1Medium-transp.png");

		if (enemyT2Mini == null) enemyT2Mini = loadImg ("/img/badass/badass2Mini.png");
		if (enemyT2Medium == null) enemyT2Medium = loadImg ("/img/badass/badass2Medium.png");
		if (enemyT2 == null) enemyT2 = loadImg ("/img/badass/badass2.png");
		if (enemyT2Large == null) enemyT2Large = loadImg ("/img/badass/badass2Large.png");
		//		------------------------------transparency badass 2
		if (enemyT2Trans == null) enemyT2Trans = loadImg ("/img/badass/transparency/badass2-transp.png");
		if (enemyT2LargeTrans == null) enemyT2LargeTrans = loadImg ("/img/badass/transparency/badass2Large-transp.png");
		if (enemyT2MiniTrans == null) enemyT2MiniTrans = loadImg ("/img/badass/transparency/badass2Mini-transp.png");
		if (enemyT2MediumTrans == null) enemyT2MediumTrans = loadImg ("/img/badass/transparency/badass2Medium-transp.png");

		if (enemyT3Mini == null) enemyT3Mini = loadImg ("/img/badass/badass3Mini.png");
		if (enemyT3Medium == null) enemyT3Medium = loadImg ("/img/badass/badass3Medium.png");
		if (enemyT3 == null) enemyT3 = loadImg ("/img/badass/badass3.png");
		if (enemyT3Large == null) enemyT3Large = loadImg ("/img/badass/badass3Large.png");
		//		------------------------------transparency badass 3
		if (enemyT3Trans == null) enemyT3Trans = loadImg ("/img/badass/transparency/badass3-transp.png");
		if (enemyT3LargeTrans == null) enemyT3LargeTrans = loadImg ("/img/badass/transparency/badass3Large-transp.png");
		if (enemyT3MiniTrans == null) enemyT3MiniTrans = loadImg ("/img/badass/transparency/badass3Mini-transp.png");
		if (enemyT3MediumTrans == null) enemyT3MediumTrans = loadImg ("/img/badass/transparency/badass3Medium-transp.png");

		if (type == 1) {
			if (rank == 1) {
				speed = 3;
				r = 15;
				health = 1;
				
				image = enemyT1Mini;
			}
			if (rank == 2) {
				speed = 3;
				r = 25;
				health = 2;

				image = enemyT1Medium;
			}
			if (rank == 3) {
				speed = 1.5;
				r = 30;
				health = 3;

				image = enemyT1;
			}
			if (rank == 4) {
				speed = 1.5;
				r = 40;
				health = 5;

				image = enemyT1Large;
			}
		}
		//		Stronger, faster default
		if (type == 2) {
			if (rank == 1) {
				speed = 3;
				r = 15;
				health = 2;
				image = enemyT2Mini;
			}
			if (rank == 2) {
				speed = 3;
				r = 25;
				health = 3;
				image = enemyT2Medium;
			}
			if (rank == 3) {
				speed = 2.5;
				r = 30;
				health = 3;
				image = enemyT2;
			}
			if (rank == 4) {
				speed = 2.5;
				r = 40;
				health = 4;
				image = enemyT2Large;
			}
		}
		//		Slow, but hard to kill
		if (type == 3) {
			if (rank == 1) {
				speed = 1.5;
				r = 15;
				health = 5;
				image = enemyT3Mini;
			}
			if (rank == 2) {
				speed = 1.5;
				r = 25;
				health = 6;
				image = enemyT3Medium;
			}
			if (rank == 3) {
				speed = 1.5;
				r = 30;
				health = 7;
				image = enemyT3;
			}
			if (rank == 4) {
				speed = 1.5;
				r = 40;
				health = 8;
				image = enemyT3Large;
			}
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
		if (hit) {
			if (image == enemyT1) image = enemyT1Trans;
			if (image == enemyT1Large) image = enemyT1LargeTrans;
			if (image == enemyT1Mini) image = enemyT1MiniTrans;
			if (image == enemyT1Medium) image = enemyT1MediumTrans;

			if (image == enemyT2) image = enemyT2Trans;

			/*g.setColor(Color.WHITE);
			g.fillOval((int) (x - r), (int) (y - r), 2 * r, 2 * r);

			g.setStroke(new BasicStroke(3));
			g.setColor(Color.WHITE.darker());
			g.drawOval((int) (x - r), (int) (y - r), 2 * r, 2 * r);
			g.setStroke(new BasicStroke(1));*/
		} else {
			if (image == enemyT1Trans) image = enemyT1;
			if (image == enemyT1LargeTrans) image = enemyT1Large;
			if (image == enemyT1MiniTrans) image = enemyT1Mini;
			if (image == enemyT1MediumTrans) image = enemyT1Medium;

			if (image == enemyT2Trans) image = enemyT2;

			/*g.setColor(c1);
			g.fillOval((int) (x - r), (int) (y - r), 2 * r, 2 * r);

			g.setStroke(new BasicStroke(3));
			g.setColor(c1.darker());
			g.drawOval((int) (x - r), (int) (y - r), 2 * r, 2 * r);
			g.setStroke(new BasicStroke(1));*/
		}
		g.drawImage(image, (int) (x - r), (int) (y - r), null);
	}
}