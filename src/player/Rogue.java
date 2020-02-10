package player;

import skills.RogueTechs;

public class Rogue extends PlayerClass {
	//bonus to lvl 1 stats
	int[] start = {
		20, 4, 1, 1, 2, 5
	};
	//growth bonuses
	int[] bonus = {
		1, 3, 1, 0, 1, 3
	};

	public Rogue(String name) {
		super(name);
		HP += start[0];  
		attack += start[1];
		defense += start[2];
		magic += start[3];
		magDefense = 0; 
		speed += start[5] * (mod.nextInt(bonus[5] + 1));//
	}
	
	@Override
	public String getClassType() {
		return "r";
	}
	
	public String[] levelUp() {
		int hpGrowth = start[0] * (mod.nextInt(bonus[0]) + 1);
		int attGrowth = start[1] * (mod.nextInt(bonus[1]) + 1);
		int defGrowth = start[2] * (mod.nextInt(bonus[2]) + 1);
		int magGrowth = start[3] * (mod.nextInt(bonus[3]) + 1);
		int magDefGrowth = start[4] * (mod.nextInt(bonus[4]) + 1);
		int spdGrowth = start[5] * (mod.nextInt(bonus[5]) + 1);
		HP += hpGrowth;  
		attack += attGrowth;
		defense += defGrowth;
		magDefense += magDefGrowth;
		speed += spdGrowth;
		String[] growths = 
		{
				"+" + hpGrowth,
				"+" + attGrowth,
				"+" + defGrowth,
				"+" + magGrowth,
				"+" + magDefGrowth,
				"+" + spdGrowth,
		};
		lvl++;
		return growths;
	}
}
