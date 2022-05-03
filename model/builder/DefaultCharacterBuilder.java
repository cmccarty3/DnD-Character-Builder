package model.builder;

import java.util.Arrays;
import java.util.Random;

public class DefaultCharacterBuilder extends CharacterBuilder {

	private Random random = new Random();
	int[] stats = new int[Character.STATS_AMT]; // 6
	int[] statsRoll = new int[4]; // 4d6
	int[] statsRollAdjusted = new int[3];
	int statRollAdded = 0;

	@Override
	public void buildName() {
		character.setCharacterName("Joe Schmoe");
	}

	@Override
	public void buildClass() {
		character.setCharacterClass("Fighter");
	}

	@Override
	public void buildRace() {
		character.setCharacterRace("Human");
	}

	@Override
	public void buildStats() {
		// 4d6 for each of the 6 main stats, discarding the lowest roll
		for (int s = 0; s < Character.STATS_AMT; s++) {
			statRollAdded = 0;
			for (int i = 0; i < statsRoll.length; i++) {
				statsRoll[i] = 1 + random.nextInt(5);
			}
			sortEm(statsRoll);
			for (int j = 1; j < statsRoll.length; j++) {
				statsRollAdjusted[j - 1] = statsRoll[j];
			}
			statRollAdded = addEm(statsRollAdjusted);
			stats[s] = statRollAdded;
		}
		// sort stats and assign accordingly
		sortEm(stats);
		character.setStrength(stats[Character.STATS_AMT - 1]);
		character.setConstitution(stats[Character.STATS_AMT - 2]);
		character.setDexterity(stats[Character.STATS_AMT - 3]);
		character.setWisdom(stats[Character.STATS_AMT - 4]);
		character.setCharisma(stats[Character.STATS_AMT - 5]);
		character.setIntelligence(stats[Character.STATS_AMT - 6]);
	}

	// sorting an array from low to high
	private int[] sortEm(int[] stats) {
		Arrays.sort(stats);
		return stats;
	}

	// adding up total of an array
	private int addEm(int[] statsRollAdjusted) {
		int totalStats = 0;
		for (int i = 0; i < statsRollAdjusted.length; i++) {
			totalStats += statsRoll[i];
		}
		return totalStats;
	}


	
}
