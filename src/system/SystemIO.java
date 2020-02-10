package system;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import player.Barbarian;
import player.PlayerClass;
import player.Cleric;
import player.Rogue;
import player.Wizard;
import skills.*;

public class SystemIO {
	
	/**
	 * Creates the player's class based on their inputs.
	 * 
	 * @throws IOException if player's input class is invalid.
	 * @return player class
	 */
	public static PlayerClass getPlayerClass() {
		System.out.println( "Welcome to my game! ");
		System.out.print("What is your name? ");
		Scanner playerScanner = new Scanner(System.in);
		String name = playerScanner.nextLine();
		System.out.println("Choose your class!");
		System.out.println("B : Barbarian\tC : Cleric\nR : Rogue\tW : Wizard");
		String classInput = "";
		try {
			classInput = playerScanner.nextLine();
			if (classInput == null) {
				throw new IOException();
			}
		} catch (IOException e) {
			System.out.print("That's not a valid class!");
			System.exit(0);
		}
		char charClass = Character.toLowerCase(classInput.charAt(0));
		PlayerClass player = null;
		switch(charClass) {
			case 'b':
				player = new Barbarian(name);
				System.out.println("Congratulations! You are now a Barbarian!");
				break;
			case 'c':
				player = new Cleric(name);
				System.out.println("Congratulations! You are now a Cleric!");
				break;
			case 'r':
				player = new Rogue(name);
				System.out.println("Congratulations! You are now a Rogue!");
				break;
			case 'w':
				player = new Wizard(name);
				System.out.println("Congratulations! You are now a Wizard!");
				break;
			default:
				System.out.println("You died because you were never born.");
				System.out.print("(Pick a valid class)");
				break;
		}
		return player;
	}
	
	static List<Techniques> readBarbTechniques() {
		Scanner techReader = null;
		List<Techniques> techList = new ArrayList<Techniques>();
		try {
			techReader = new Scanner(new File("src/skills/skill-files/barbTechs.txt"));
			while (techReader.hasNextLine()) {
				String name = techReader.next();
				int availableLevel = techReader.nextInt();
				int spCost = techReader.nextInt();
				double damageMod = techReader.nextDouble();
				String effect = techReader.next();
				String element = techReader.next();
				techList.add(new BarbTechs(name, availableLevel, spCost, damageMod, effect, element));
			}
		} catch (FileNotFoundException e) {
			System.out.println("Can't load barb techs.");
		}
		return techList;
	}
	
	static List<Techniques> readRogueTechniques() {
		Scanner techReader = null;
		List<Techniques> techList = new ArrayList<Techniques>();
		try {
			techReader = new Scanner(new File("src/skills/skill-files/rogueTechs.txt"));
			while (techReader.hasNextLine()) {
				String name = techReader.next();
				int availableLevel = techReader.nextInt();
				int spCost = techReader.nextInt();
				double damageMod = techReader.nextDouble();
				String effect = techReader.next();
				String element = techReader.next();
				techList.add(new RogueTechs(name, availableLevel, spCost, damageMod, effect, element));
			}
		} catch (FileNotFoundException e) {
			System.out.println("Can't load rogue techs.");
		}
		return techList;
	}
	
	static List<Magic> readWizardMagic() {
		Scanner spellReader = null;
		List<Magic> spellList = new ArrayList<Magic>();
		try {
			spellReader = new Scanner(new File("src/skills/skill-files/wizardSpells.txt"));
			while (spellReader.hasNextLine()) {
				String name = spellReader.next();
				int availableLevel = spellReader.nextInt();
				int cooldown = spellReader.nextInt();
				double damageMod = spellReader.nextDouble();
				String effect = spellReader.next();
				String element = spellReader.next();
				spellList.add(new WizardSpells(name, availableLevel, cooldown, damageMod, effect, element));
			}
		} catch (FileNotFoundException e) {
			System.out.println("Can't load wizard spells.");
		}
		return spellList;
	}
	/**
	 * Reads in all of the spells the cleric can learn from an external text file.
	 * 
	 * Text files ordered as name, availableLevel, cool down, damageMod, effect, element.
	 * 
	 * @throws FileNotFoundException if file not found
	 * @return list of spells
	 */
	static List<Magic> readClericMagic() {
		Scanner spellReader = null;
		List<Magic> spellList = new ArrayList<Magic>();
		try {
			spellReader = new Scanner(new File("src/skills/skill-files/clericSpells.txt"));
			while (spellReader.hasNextLine()) {
				String name = spellReader.next();
				int availableLevel = spellReader.nextInt();
				int cooldown = spellReader.nextInt();
				double damageMod = spellReader.nextDouble();
				String effect = spellReader.next();
				String element = spellReader.next();
				spellList.add(new ClericSpells(name, availableLevel, cooldown, damageMod, effect, element));
			}
		} catch (FileNotFoundException e) {
			System.out.println("Can't load cleric spells.");
		}
		return spellList;
	}
	
	static List<Magic> readHealingMagic() {
		Scanner spellReader = null;
		List<Magic> spellList = new ArrayList<Magic>();
		try {
			spellReader = new Scanner(new File("src/skills/skill-files/healingSpells.txt"));
			while (spellReader.hasNextLine()) {
				String name = spellReader.next();
				int availableLevel = spellReader.nextInt();
				int cooldown = spellReader.nextInt();
				double healingMod = spellReader.nextDouble();
				spellList.add(new ClericSpells(name, availableLevel, cooldown, healingMod));
			}
		} catch (FileNotFoundException e) {
			System.out.println("Can't load healing spells.");
		}
		return spellList;
	}
}
