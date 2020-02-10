package skills;

public class BarbTechs extends Techniques {

	double spCostRegenMod = .4;
	
	public BarbTechs(String name, int availableLevel, int spCost,
			double damageMod, String effect, String element) {
		super(name, availableLevel, spCost, damageMod, effect, element);
	}

	void spRegen(int spValue, int currentSpd) {
		spValue += Math.ceil(spCostRegenMod * currentSpd);
		setCurrentSpValue(spValue);
	}

}
