import javax.swing.JFrame;

import view.CharacterScreen;

public class Main {
	public static void main(String[] args) {

		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setTitle(("Character Builder"));
		window.setLocation(500, 200);

		var characterScreen = new CharacterScreen(window);
		characterScreen.init();

		window.setResizable(false);
		window.pack();
		window.setVisible(true);
		
	} 
}