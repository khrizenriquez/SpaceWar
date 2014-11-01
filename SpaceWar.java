/*
		Author: 		Khriz Enríquez	@khrizenriquez
		
		version: 		0.0.2
		Image sprites: 	http://www.tenvinilo.com/img/vinilo/png/sticker%20infantil%20set%20de%20ovnis.png
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