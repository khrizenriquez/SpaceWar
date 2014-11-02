import java.awt.*;
import java.awt.image.*;
import java.net.URL;
import javax.imageio.*;

public class PowerUp extends Generals{
	private Color color;
	private double x, y;
	private int r, type;
	private BufferedImage imgLife, imgPower2;

	//	1 = +1 life
	//	2 = +1 power
	//	3 = +2 power
	public PowerUp (int type, double x, double y) {
		this.type = type;
		this.x = x;
		this.y = y;

		if (type == 1) {
			if (imgLife == null) imgLife = loadImg ("/img/features/life.png");
			r = 3;
		}
		if (type == 2) {
			color = Color.WHITE;
			r = 4;
		}
		if (type == 3) {
			if (imgPower2 == null) imgPower2 = loadImg ("/img/features/mosterEnery.png");
			r = 6;
		}
	}

	//		Getters
	public double getX () {return x;}
	public double getY () {return y;}
	public double getR () {return r;}
	public int getType () {return type;}
	//		Setters

	//		Render methods
	public boolean update () {
		y += 2;
		if (y > SpacePanel.height + r) return true;
		return false;
	}
	public void draw (Graphics2D g) {
		if (type == 1) {
			g.drawImage(imgLife, (int) (x - r), (int) (y - r), null);
		} else 
		if (type == 3) {
			g.drawImage(imgPower2, (int) (x - r), (int) (y - r), null);
		} else {
			g.setColor(color);
			g.fillRect((int) (x - r), (int) (y - r), 2 * r, 2 * r);

			g.setStroke(new BasicStroke(3));
			g.setColor(color.darker());
			g.drawRect((int) (x - r), (int) (y - r), 2 * r, 2 * r);
			g.setStroke(new BasicStroke(1));
		}
	}
}