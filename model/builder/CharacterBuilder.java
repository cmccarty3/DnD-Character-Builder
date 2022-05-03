package model.builder;

public abstract class CharacterBuilder {

	protected Character character;

	public Character getCharacter() {
		return character;
	}

	public void createCharacter() {
		character = new Character();
	}

	public abstract void buildName();
	public abstract void buildClass();
	public abstract void buildRace();
	public abstract void buildStats();
	
}
