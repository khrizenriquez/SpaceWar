import java.awt.*;

public class PowerUp {
	private Color color;
	private double x, y;
	private int r, type;

	//	1 = +1 life
	//	2 = +1 power
	//	3 = +2 power
	public PowerUp (int type, double x, double y) {
		this.type = type;
		this.x = x;
		this.y = y;

		if (type == 1) {
			color = Color.RED;
			r = 3;
		}
		if (type == 2) {
			color = Color.GREEN;
			r = 4;
		}
		if (type == 3) {
			color = Color.YELLOW;
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
		if (y > SpacePanel.height + r) 
			return true;
		return false;
	}
	public void draw (Graphics2D g) {
		g.setColor(color);
		g.fillRect((int) (x - r), (int) (y - r), 2 * r, 2 * r);

		g.setStroke(new BasicStroke(3));
		g.setColor(color.darker());
		g.drawRect((int) (x - r), (int) (y - r), 2 * r, 2 * r);
		g.setStroke(new BasicStroke(1));
	}
}