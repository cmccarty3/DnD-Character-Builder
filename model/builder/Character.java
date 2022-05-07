package model.builder;

public class Character 
{
	public static final int STATS_AMT = 6;

	private String characterClass;
	private String characterRace;
	private String characterName;

	private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;
	
	public void setCharacterClass(String characterClass) 
	{
		this.characterClass = characterClass;
	}

	public void setCharacterRace(String characterRace) 
	{
		this.characterRace = characterRace;
	}

	public void setCharacterName(String characterName) 
	{
		this.characterName = characterName;
	}

	public void setStrength(int strength) 
	{
		this.strength = strength;
	}

	public void setDexterity(int dexterity) 
	{
		this.dexterity = dexterity;
	}

	public void setConstitution(int constitution) 
	{
		this.constitution = constitution;
	}

	public void setIntelligence(int intelligence) 
	{
		this.intelligence = intelligence;
	}

	public void setWisdom(int wisdom) 
	{
		this.wisdom = wisdom;
	}

	public void setCharisma(int charisma) 
	{
		this.charisma = charisma;
	}

	@Override
	public String toString() 
	{
		return "Character["+characterName+", "+characterRace+", "+characterClass+" Strength: "+strength+", Dexterity: "+dexterity+", Constitution: "+constitution+", Intelligence: "+intelligence+", Wisdom: "+wisdom+", Charisma "+charisma+"]";
	}	
}