package skills;

public class WizardSpells extends Magic {

	public WizardSpells(String name, int availableLevel, int cooldown,
			double damageMod, String effect, String element) {
		super(name, availableLevel, cooldown, damageMod, effect, element);
	}

	void regen(int spValue, int currentSpd) {
		currentCooldown--;
	}
}
