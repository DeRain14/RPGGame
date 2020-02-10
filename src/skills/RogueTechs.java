package skills;

public class RogueTechs extends Techniques {
	
	double spCostRegenMod = .45;
	
	public RogueTechs(String name, int availableLevel, int spCost,
			double damageMod, String effect, String element) {
		super(name, availableLevel, spCost, damageMod, effect, element);
	}

	/**
	 * Regenerates the character's SP
	 * @param spValue
	 * @param currentSpd
	 */
	void spRegen(int spValue, int currentSpd) {
		spValue += Math.ceil(spCostRegenMod * currentSpd);
		setCurrentSpValue(spValue);
	}

}
