package skills;

public class Techniques {

	String name;
	int availableLevel;
	int spCost;
	int currentSpValue;
	double damageMod;
	String effect;
	String element;
	
	enum EFFECTS {POISON, STATIC, BURN, FROZEN, WET, NONE};
	enum ELEMENTS {EARTH, LIGHTNING, FIRE, ICE, WATER, NONE};
	
	public Techniques(String name, int availableLevel, int spCost, 
			double damageMod2, String effect, String element) {
		setName(name);
		setAvailableLevel(availableLevel);
		setSpCost(spCost);
		setDamageMod(damageMod2);
		setEffect(effect);
		setElement(element);
	}
	
	protected void setAvailableLevel(int level) {
		this.availableLevel = level;
	}

	int useTech(int attackValue) {
		double damage = attackValue * damageMod;
		setCurrentSpValue(0);
		return (int)damage;
	}

	public String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public int getSpCost() {
		return spCost;
	}

	protected void setSpCost(int spCost) {
		this.spCost = spCost;
	}

	public double getDamageMod() {
		return damageMod;
	}

	protected void setDamageMod(double damageMod2) {
		this.damageMod = damageMod2;
	}

	public String getEffect() {
		return effect;
	}

	protected void setEffect(String effect) {
		this.effect = effect;
	}

	public String getElement() {
		return element;
	}

	protected void setElement(String element) {
		this.element = element;
	}
	
	public int getCurrentSpValue() {
		return currentSpValue;
	}
	
	protected void setCurrentSpValue(int value) {
		this.currentSpValue = value;
	}
}
