package model.builder;

public class CharacterBuildDirector 
{
	private CharacterBuilder characterBuilder;

	public void setCharacterBuilder(CharacterBuilder characterBuilder) 
	{
		this.characterBuilder = characterBuilder;
	}

	public Character getCharacter() 
	{
		return characterBuilder.getCharacter();
	}

	public void createCharacter() 
	{
		characterBuilder.createCharacter();
		characterBuilder.buildName();
		characterBuilder.buildRace();
		characterBuilder.buildClass();
		characterBuilder.buildStats();
	}	
}