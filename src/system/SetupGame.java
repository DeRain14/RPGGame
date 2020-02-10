package system;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import player.PlayerClass;
import player.Barbarian;
import player.Cleric;
import player.Rogue;
import player.Wizard;
import skills.Magic;
import skills.Techniques;

public class SetupGame {
	
	boolean isAlive = false;

	public static void main(String[] args) {
		PlayerClass player = SystemIO.getPlayerClass();
		ArrayList<Magic> magicList = new ArrayList<Magic>();
		ArrayList<Techniques> techList = new ArrayList<Techniques>();
		switch (player.getClassType()) {
			case "b":
				techList = (ArrayList<Techniques>) SystemIO.readBarbTechniques();
				break;
			case "c":
				magicList = (ArrayList<Magic>) SystemIO.readClericMagic();
				magicList.addAll(SystemIO.readHealingMagic());
				magicList.sort(new sortByLevel());
				break;
			case "r":
				techList = (ArrayList<Techniques>) SystemIO.readRogueTechniques();
				break;
			case "w":
				magicList = (ArrayList<Magic>) SystemIO.readWizardMagic();
				break;
		}
		
	}

}

class sortByLevel implements Comparator<Magic> {

	@Override
	public int compare(Magic m1, Magic m2) {
		return Integer.compare(m1.getAvailableLevel(), m2.getAvailableLevel());
	}
	
}
