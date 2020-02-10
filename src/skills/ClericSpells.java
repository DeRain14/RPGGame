package skills;

public class ClericSpells extends Magic {
	
	public ClericSpells(String name, int availableLevel, int cooldown,
			double damageMod, String effect, String element) {
		super(name, availableLevel, cooldown, damageMod, effect, element);
	}
	
	public ClericSpells(String name, int availableLevel, int cooldown, double healingMod) {
		super(name, availableLevel, cooldown, healingMod);
	}

	/**
	 * Lessens the cooldown on all skills
	 * 
	 * @param spValue
	 * @param currentSpd
	 */
	void regen(int spValue, int currentSpd) {
		currentCooldown--;
	}

}
