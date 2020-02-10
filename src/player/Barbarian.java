package player;

import skills.BarbTechs;

public class Barbarian extends PlayerClass {
	//bonus to starting stats
	int[] start = {
		30, 5, 3, 1, 1, 3
	};
	//level up bonuses
	int[] bonus = {
			3, 2, 2, 0, 1, 1
	};
	
	public Barbarian(String name) {
		super(name);
		HP += start[0];  
		attack += start[1];
		defense += start[2];
		magic = 0;
		magDefense += start[4]; 
		speed += start[5] * (mod.nextInt(bonus[5] + 1));
	}
	
	@Override
	public String getClassType() {
		return "b";
	}
	
	public Barbarian(String name, int startingLevel) {
		super(name);
		HP += start[0]; 
		attack += start[1];
		defense += start[2];
		magic = 0;
		magDefense += start[4]; 
		speed += start[5] * (mod.nextInt(bonus[5] + 1));
		for (int i = 0; i < startingLevel; i++) {
			levelUp();
		}
	}

	public int[] getStats() {
		int[] stats = {HP, attack, defense, magic, magDefense, speed};
		return stats;
	}
	
	public String[] levelUp() {
		int hpGrowth = start[0] * (mod.nextInt(bonus[0]) + 1);
		int attGrowth = start[1] * (mod.nextInt(bonus[1]) + 1);
		int defGrowth = start[2] * (mod.nextInt(bonus[2]) + 1);
		int magGrowth = 0;
		int magDefGrowth = start[4] * (mod.nextInt(bonus[4]) + 1);
		int spdGrowth = start[5] * (mod.nextInt(bonus[5]) + 1);
		HP += hpGrowth;  
		attack += attGrowth;
		defense += defGrowth;
		magDefense += magDefGrowth;
		speed += spdGrowth;
		String[] growths = 
		{
				"HP: +" + hpGrowth,
				"ATT: +" + attGrowth,
				"DEF: +" + defGrowth,
				"MAG: +" + magGrowth,
				"MAG DEF: +" + magDefGrowth,
				"SPD: +" + spdGrowth,
		};
		lvl++;
		return growths;
	}
	
}
