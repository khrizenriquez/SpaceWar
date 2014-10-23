/*
		Author: Khriz Enríquez	@khrizenriquez

		Image sprites: http://sm.ingenieriamultimedia.org/lib/exe/fetch.php?media=alumnos:grupo_13:naves.png
*/
package SpaceWar;

import javax.swing.JFrame;

public class SpaceWar {
	public static void main(String[] args) {
		JFrame container = new JFrame("SpaceWar");

		container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		container.setContentPane(new SpacePanel());

		//		Hides the border in our game
		container.setUndecorated(true);

		container.setResizable(false);
		container.setLocationRelativeTo(null);
		container.pack();
		container.setVisible(true);
	}
}