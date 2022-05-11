package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.builder.Character;
import model.builder.CharacterBuildDirector;
import model.builder.CharacterBuilder;
import model.builder.DefaultCharacterBuilder;
import view.CharacterScreen;

public class CharacterScreenListener implements ActionListener 
{
	private CharacterScreen characterScreen;
	private CharacterBuildDirector director;
	private CharacterBuilder builder;
	private Character character;

	public CharacterScreenListener(CharacterScreen characterScreen) 
	{
		this.characterScreen = characterScreen;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JButton button = (JButton) e.getSource();
		if (button == characterScreen.getBuildCharacterButton()) 
		{
			director = new CharacterBuildDirector();
			builder = new DefaultCharacterBuilder();
			director.setCharacterBuilder(builder);
			director.createCharacter();
			character = director.getCharacter();

			characterScreen.getNameField().setText("" + character.getCharacterName());
			characterScreen.getClassField().setText("" + character.getCharacterClass());
			characterScreen.getRaceField().setText("" + character.getCharacterRace());

			characterScreen.getStrengthField().setText("" + character.getStrength());
			characterScreen.getDexterityField().setText("" + character.getDexterity());
			characterScreen.getConstitutionField().setText("" + character.getConstitution());
			characterScreen.getIntelligenceField().setText("" + character.getIntelligence());
			characterScreen.getWisdomField().setText("" + character.getWisdom());
			characterScreen.getCharismaField().setText("" + character.getCharisma());

		}
		else if (button == characterScreen.getRerollStatsButton()) 
		{

		}
		else if (button == characterScreen.getQuitButton())
		{
			System.exit(0);
		}
	}
}
