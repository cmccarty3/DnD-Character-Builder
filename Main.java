import javax.swing.JFrame;

import model.builder.Character;
import model.builder.CharacterBuildDirector;
import model.builder.CharacterBuilder;
import model.builder.DefaultCharacterBuilder;
import view.CharacterScreen;

public class Main 
{
	public static void main(String[] args) 
	{
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setTitle(("Character Builder"));
		window.setLocation(500, 200);

		var characterScreen = new CharacterScreen(window);
		characterScreen.init();

		window.setResizable(false);
		window.pack();
		window.setVisible(true);

		// Default Character
		CharacterBuildDirector director = new CharacterBuildDirector();
		CharacterBuilder builder = new DefaultCharacterBuilder();
		director.setCharacterBuilder(builder);
		director.createCharacter();
		Character character = director.getCharacter();
		System.out.println(character);		
	} 
}