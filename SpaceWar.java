/*
		Author: 		Khriz Enríquez	@khrizenriquez
		
		version: 		0.1.1
		
		-New stages
*/
import javax.swing.JFrame;

public class SpaceWar {
	public static void main(String[] args) {
		JFrame container = new JFrame("SpaceWar");

		container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		container.setContentPane(new SpacePanel());

		//		Hides the border in our game
		container.setUndecorated(true);

		container.setResizable(false);
		container.pack();
		container.setLocationRelativeTo(null);
		container.setVisible(true);
	}
}