import java.awt.*;

public class Text {
	private double x;
	private double y;
	private long time, start;
	private String s;

	public Text (double x, double y, long time, String s) {
		this.x = x;
		this.y = y;
		this.time = time;
		this.s = s;

		start = System.nanoTime();
		//start = (System.nanoTime() - start) / 1000000;
	}

	public boolean update () {
		long elapsed = (System.nanoTime() - start) / 1000000;
		if (elapsed > time) 
			return true;
		return false;
	}
	public void draw (Graphics2D g) {
		g.setFont(new Font("Century Gothic", Font.PLAIN, 12));
		long elapsed = (System.nanoTime() - start) / 1000000;
		//int alpha = (int) (255 * Math.sin(Math.PI * elapsed / time));
		//if (alpha > 255) alpha = 255;
		g.setColor(new Color(255, 255, 255, 128));
		int length = (int) g.getFontMetrics().getStringBounds(s, g).getWidth();
		g.drawString(s, (int) (x - (length / 2)), (int) y);
	}
}