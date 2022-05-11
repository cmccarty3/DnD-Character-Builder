package view;

import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JRadioButton;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.CharacterScreenListener;

public class CharacterScreen 
{
	private JFrame window;

	private JTextField nameField = new JTextField();
	private JTextField classField = new JTextField();
	private JTextField levelField = new JTextField();
	private JTextField raceField = new JTextField();
	private JTextField backgroundField = new JTextField();
	private JTextField experienceField = new JTextField();
	private JTextField armorClassField = new JTextField();
	private JTextField initiativeField = new JTextField();
	private JTextField speedField = new JTextField();
	private JTextField hitPointsField = new JTextField();
	private JTextField passivePerceptionField = new JTextField();
	private JTextField proficiencyBonusField = new JTextField();
	private JTextField strengthField = new JTextField();
	private JTextField dexterityField = new JTextField();
	private JTextField constitutionField = new JTextField();
	private JTextField intelligenceField = new JTextField();
	private JTextField wisdomField = new JTextField();
	private JTextField charismaField = new JTextField();
	private JTextField totalStatsField = new JTextField();

	private JLabel nameLabel = new JLabel("Name", SwingConstants.LEFT);
	private JLabel classLabel = new JLabel("Class", SwingConstants.LEFT);
	private JLabel levelLabel = new JLabel("Level", SwingConstants.LEFT);
	private JLabel raceLabel = new JLabel("Race", SwingConstants.LEFT);
	private JLabel backgroundLabel = new JLabel("Background", SwingConstants.LEFT);
	private JLabel experienceLabel = new JLabel("Experience", SwingConstants.LEFT);
	private JLabel armorClassLabel = new JLabel("Armor Class", SwingConstants.CENTER);
	private JLabel initiativeLabel = new JLabel("Initiative", SwingConstants.CENTER);
	private JLabel speedLabel = new JLabel("Speed", SwingConstants.CENTER);
	private JLabel hitPointsLabel = new JLabel("Hit Points", SwingConstants.CENTER);
	private JLabel passivePerceptionLabel = new JLabel("Passive Perception", SwingConstants.CENTER);
	private JLabel proficiencyBonusLabel = new JLabel("Proficiency Bonus", SwingConstants.CENTER);
	private JLabel strengthLabel = new JLabel("Strength", SwingConstants.CENTER);
	private JLabel dexterityLabel = new JLabel("Dexterity", SwingConstants.CENTER);
	private JLabel constitutionLabel = new JLabel("Constitution", SwingConstants.CENTER);
	private JLabel intelligenceLabel = new JLabel("Intelligence", SwingConstants.CENTER);
	private JLabel wisdomLabel = new JLabel("Wisdom", SwingConstants.CENTER);
	private JLabel charismaLabel = new JLabel("Charisma", SwingConstants.CENTER);
	private JLabel totalStatsLabel = new JLabel("Total: ", SwingConstants.CENTER);

	private JRadioButton strengthSaveButton = new JRadioButton("Strength");
	private JRadioButton dexteritySaveButton = new JRadioButton("Dexterity");
	private JRadioButton constitutionSaveButton = new JRadioButton("Constitution");
	private JRadioButton intelligenceSaveButton = new JRadioButton("Intelligence");
	private JRadioButton wisdomSaveButton = new JRadioButton("Wisdom");
	private JRadioButton charismaSaveButton = new JRadioButton("Charisma");
	private JRadioButton acrobaticsButton = new JRadioButton("Acrobatics");
	private JRadioButton animalHandlingButton = new JRadioButton("Animal Handling");
	private JRadioButton arcanaButton = new JRadioButton("Arcana");
	private JRadioButton athleticsButton = new JRadioButton("Athletics");
	private JRadioButton deceptionButton = new JRadioButton("Deception");
	private JRadioButton historyButton = new JRadioButton("History");
	private JRadioButton insightButton = new JRadioButton("Insight");
	private JRadioButton intimidationButton = new JRadioButton("Intimidation");
	private JRadioButton investigationButton = new JRadioButton("Investigation");
	private JRadioButton medicineButton = new JRadioButton("Medicine");
	private JRadioButton natureButton = new JRadioButton("Nature");
	private JRadioButton perceptionButton = new JRadioButton("Perception");
	private JRadioButton performanceButton = new JRadioButton("Performance");
	private JRadioButton persuasionButton = new JRadioButton("Persuasion");
	private JRadioButton religionButton = new JRadioButton("Religion");
	private JRadioButton sleightOfHandButton = new JRadioButton("Sleight of Hand");
	private JRadioButton stealthButton = new JRadioButton("Stealth");
	private JRadioButton survivalButton = new JRadioButton("Survival");

	JButton buildCharacterButton = new JButton("Build Character");
	JButton rerollStatsButton = new JButton("Reroll Stats");
	JButton quitButton = new JButton("Quit");

	public CharacterScreen(JFrame window) 
	{
		this.window = window;
	}

	public void init() 
	{
		Container cp = window.getContentPane();

		JPanel northPanel = new JPanel();
		northPanel.setLayout(new GridLayout(3, 4, 5, 5));
		northPanel.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
		northPanel.add(nameLabel);
		northPanel.add(nameField);
		northPanel.add(classLabel);
		northPanel.add(classField);
		northPanel.add(levelLabel);
		northPanel.add(levelField);
		northPanel.add(raceLabel);
		northPanel.add(raceField);
		northPanel.add(backgroundLabel);
		northPanel.add(backgroundField);
		northPanel.add(experienceLabel);
		northPanel.add(experienceField);
		cp.add(BorderLayout.NORTH, northPanel);

		JPanel westPanel = new JPanel();
		westPanel.setLayout(new GridLayout(14, 1, 5, 5));
		westPanel.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 0));
		westPanel.add(strengthLabel);
		westPanel.add(strengthField);
		westPanel.add(dexterityLabel);
		westPanel.add(dexterityField);
		westPanel.add(constitutionLabel);
		westPanel.add(constitutionField);
		westPanel.add(intelligenceLabel);
		westPanel.add(intelligenceField);
		westPanel.add(wisdomLabel);
		westPanel.add(wisdomField);
		westPanel.add(charismaLabel);
		westPanel.add(charismaField);
		westPanel.add(totalStatsLabel);
		westPanel.add(totalStatsField);
		totalStatsField.setEditable(false);
		cp.add(BorderLayout.WEST, westPanel);

		/*
			Will add an action listener to each radiobutton which will update a counter 
			if selecteed. When the counter is reached, add a function to make the others 
			unclickable using: .setActionCommand("disable");
		*/
		JPanel centerPanelSaves = new JPanel();
		centerPanelSaves.setLayout(new GridLayout(3, 2));
		centerPanelSaves.setBorder(BorderFactory.createTitledBorder("Saves"));
		centerPanelSaves.add(strengthSaveButton);
		centerPanelSaves.add(dexteritySaveButton);
		centerPanelSaves.add(constitutionSaveButton);
		centerPanelSaves.add(intelligenceSaveButton);
		centerPanelSaves.add(wisdomSaveButton);
		centerPanelSaves.add(charismaSaveButton);

		JPanel centerPanelSkills = new JPanel();
		centerPanelSkills.setLayout(new GridLayout(9, 2));
		centerPanelSkills.setBorder(BorderFactory.createTitledBorder("Skills"));
		centerPanelSkills.add(acrobaticsButton);
		centerPanelSkills.add(animalHandlingButton);
		centerPanelSkills.add(arcanaButton);
		centerPanelSkills.add(athleticsButton);
		centerPanelSkills.add(deceptionButton);
		centerPanelSkills.add(historyButton);
		centerPanelSkills.add(insightButton);
		centerPanelSkills.add(intimidationButton);
		centerPanelSkills.add(investigationButton);
		centerPanelSkills.add(medicineButton);
		centerPanelSkills.add(natureButton);
		centerPanelSkills.add(perceptionButton);
		centerPanelSkills.add(performanceButton);
		centerPanelSkills.add(persuasionButton);
		centerPanelSkills.add(religionButton);
		centerPanelSkills.add(sleightOfHandButton);
		centerPanelSkills.add(stealthButton);
		centerPanelSkills.add(survivalButton);

		JPanel centerPanelCombined = new JPanel();
		centerPanelCombined.setLayout(new BoxLayout(centerPanelCombined, BoxLayout.PAGE_AXIS));
		centerPanelCombined.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
		centerPanelCombined.add(centerPanelSaves);
		centerPanelCombined.add(centerPanelSkills);
		cp.add(BorderLayout.CENTER, centerPanelCombined);

		JPanel eastPanel = new JPanel();
		eastPanel.setLayout(new GridLayout(12, 1, 5, 5));
		eastPanel.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
		eastPanel.add(proficiencyBonusLabel);
		eastPanel.add(proficiencyBonusField);
		proficiencyBonusField.setEditable(false);
		eastPanel.add(armorClassLabel);
		eastPanel.add(armorClassField);
		armorClassField.setEditable(false);
		eastPanel.add(hitPointsLabel);
		eastPanel.add(hitPointsField);
		hitPointsField.setEditable(false);
		eastPanel.add(initiativeLabel);
		eastPanel.add(initiativeField);
		initiativeField.setEditable(false);
		eastPanel.add(speedLabel);
		eastPanel.add(speedField);
		speedField.setEditable(false);
		eastPanel.add(passivePerceptionLabel);
		eastPanel.add(passivePerceptionField);
		passivePerceptionField.setEditable(false);
		cp.add(BorderLayout.EAST, eastPanel);

		JPanel southPanel = new JPanel();
		southPanel.add(buildCharacterButton);
		southPanel.add(rerollStatsButton);
		southPanel.add(quitButton);
		cp.add(BorderLayout.SOUTH, southPanel);

		CharacterScreenListener listener = new CharacterScreenListener(this);
		buildCharacterButton.addActionListener(listener);
		rerollStatsButton.addActionListener(listener);
		quitButton.addActionListener(listener);
	}

	public JButton getBuildCharacterButton() {
		return buildCharacterButton;
	}

	public JButton getRerollStatsButton() {
		return rerollStatsButton;
	}

	public JButton getQuitButton() {
		return quitButton;
	}

	public JTextField getStrengthField() {
		return strengthField;
	}

	public JTextField getDexterityField() {
		return dexterityField;
	}

	public JTextField getConstitutionField() {
		return constitutionField;
	}

	public JTextField getIntelligenceField() {
		return intelligenceField;
	}

	public JTextField getWisdomField() {
		return wisdomField;
	}

	public JTextField getCharismaField() {
		return charismaField;
	}

	public JTextField getNameField() {
		return nameField;
	}

	public JTextField getClassField() {
		return classField;
	}

	public JTextField getRaceField() {
		return raceField;
	}
}