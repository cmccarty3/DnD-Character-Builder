package model.builder;

public class Character 
{
	public static final int STATS_AMT = 6;

	private String characterClass;
	private String characterRace;
	private String characterName;

	private int hitPoints;
	private int statsTotal;
	private int savesTotal;
	private int skillsTotal;
	private int proficiencyBonus;
	private int passivePerception;

	private int strength;
	private int dexterity;
	private int constitution;
	private int intelligence;
	private int wisdom;
	private int charisma;

	private int strengthSave;
	private int dexteritySave;
	private int constitutionSave;
	private int intelligenceSave;
	private int wisdomSave;
	private int charismaSave;

	private int acrobaticsSkill;
	private int animalHandlingSkill;
	private int arcanaSkill;
	private int athleticsSkill;
	private int deceptionSkill;
	private int historySkill;
	private int insightSkill;
	private int intimidationSkill;
	private int investigationSkill;
	private int medicineSkill;
	private int natureSkill;
	private int perceptionSkill;
	private int performanceSkill;
	private int persuasionSkill;
	private int religionSkill;
	private int sleightOfHandSkill;
	private int stealthSkill;
	private int survivalSkill;
	
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

	public void setAcrobaticsSkill(int acrobaticsSkill) {
		this.acrobaticsSkill = acrobaticsSkill;
	}

	public void setAnimalHandlingSkill(int animalHandlingSkill) {
		this.animalHandlingSkill = animalHandlingSkill;
	}

	public void setArcanaSkill(int arcanaSkill) {
		this.arcanaSkill = arcanaSkill;
	}

	public void setAthleticsSkill(int athleticsSkill) {
		this.athleticsSkill = athleticsSkill;
	}

	public void setCharismaSave(int charismaSave) {
		this.charismaSave = charismaSave;
	}

	public void setConstitutionSave(int constitutionSave) {
		this.constitutionSave = constitutionSave;
	}
	
	public void setDeceptionSkill(int deceptionSkill) {
		this.deceptionSkill = deceptionSkill;
	}

	public void setDexteritySave(int dexteritySave) {
		this.dexteritySave = dexteritySave;
	}

	public void setHistorySkill(int historySkill) {
		this.historySkill = historySkill;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public void setInsightSkill(int insightSkill) {
		this.insightSkill = insightSkill;
	}

	public void setIntelligenceSave(int intelligenceSave) {
		this.intelligenceSave = intelligenceSave;
	}

	public void setIntimidationSkill(int intimidationSkill) {
		this.intimidationSkill = intimidationSkill;
	}

	public void setInvestigationSkill(int investigationSkill) {
		this.investigationSkill = investigationSkill;
	}

	public void setMedicineSkill(int medicineSkill) {
		this.medicineSkill = medicineSkill;
	}

	public void setNatureSkill(int natureSkill) {
		this.natureSkill = natureSkill;
	}

	public void setPassivePerception(int passivePerception) {
		this.passivePerception = passivePerception;
	}

	public void setPerceptionSkill(int perceptionSkill) {
		this.perceptionSkill = perceptionSkill;
	}

	public void setPerformanceSkill(int performanceSkill) {
		this.performanceSkill = performanceSkill;
	}

	public void setPersuasionSkill(int persuasionSkill) {
		this.persuasionSkill = persuasionSkill;
	}

	public void setProficiencyBonus(int proficiencyBonus) {
		this.proficiencyBonus = proficiencyBonus;
	}

	public void setReligionSkill(int religionSkill) {
		this.religionSkill = religionSkill;
	}

	public void setSavesTotal(int savesAmt) {
		this.savesTotal = savesAmt;
	}

	public void setSkillsTotal(int skillsAmt) {
		this.skillsTotal = skillsAmt;
	}

	public void setSleightOfHandSkill(int sleightOfHandSkill) {
		this.sleightOfHandSkill = sleightOfHandSkill;
	}

	public void setStatsTotal(int statsAmt) {
		this.statsTotal = statsAmt;
	}

	public void setStealthSkill(int stealthSkill) {
		this.stealthSkill = stealthSkill;
	}

	public void setStrengthSave(int strengthSave) {
		this.strengthSave = strengthSave;
	}

	public void setSurvivalSkill(int survivalSkill) {
		this.survivalSkill = survivalSkill;
	}

	public void setWisdomSave(int wisdomSave) {
		this.wisdomSave = wisdomSave;
	}

	public int getAcrobaticsSkill() {
		return acrobaticsSkill;
	}

	public int getAnimalHandlingSkill() {
		return animalHandlingSkill;
	}

	public int getArcanaSkill() {
		return arcanaSkill;
	}

	public int getAthleticsSkill() {
		return athleticsSkill;
	}

	public String getCharacterClass() {
		return characterClass;
	}

	public String getCharacterName() {
		return characterName;
	}

	public String getCharacterRace() {
		return characterRace;
	}

	public int getCharisma() {
		return charisma;
	}

	public int getCharismaSave() {
		return charismaSave;
	}

	public int getConstitution() {
		return constitution;
	}

	public int getConstitutionSave() {
		return constitutionSave;
	}

	public int getDeceptionSkill() {
		return deceptionSkill;
	}

	public int getDexterity() {
		return dexterity;
	}

	public int getDexteritySave() {
		return dexteritySave;
	}

	public int getHistorySkill() {
		return historySkill;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public int getInsightSkill() {
		return insightSkill;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public int getIntelligenceSave() {
		return intelligenceSave;
	}

	public int getIntimidationSkill() {
		return intimidationSkill;
	}

	public int getInvestigationSkill() {
		return investigationSkill;
	}

	public int getMedicineSkill() {
		return medicineSkill;
	}

	public int getNatureSkill() {
		return natureSkill;
	}

	public int getPassivePerception() {
		return passivePerception;
	}

	public int getPerceptionSkill() {
		return perceptionSkill;
	}

	public int getPerformanceSkill() {
		return performanceSkill;
	}

	public int getPersuasionSkill() {
		return persuasionSkill;
	}

	public int getProficiencyBonus() {
		return proficiencyBonus;
	}

	public int getReligionSkill() {
		return religionSkill;
	}

	public int getStatsTotal() {
		return statsTotal;
	}

	public int getSavesTotal() {
		return savesTotal;
	}

	public int getSkillsTotal() {
		return skillsTotal;
	}

	public int getSleightOfHandSkill() {
		return sleightOfHandSkill;
	}

	public int getStealthSkill() {
		return stealthSkill;
	}

	public int getStrength() {
		return strength;
	}

	public int getStrengthSave() {
		return strengthSave;
	}

	public int getSurvivalSkill() {
		return survivalSkill;
	}

	public int getWisdom() {
		return wisdom;
	}

	public int getWisdomSave() {
		return wisdomSave;
	}

	@Override
	public String toString() 
	{
		return "Character["+characterName+", "+characterRace+", "+characterClass+" Strength: "+strength+", Dexterity: "+dexterity+", Constitution: "+constitution+", Intelligence: "+intelligence+", Wisdom: "+wisdom+", Charisma "+charisma+"]";
	}	
}