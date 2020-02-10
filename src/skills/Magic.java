package skills;

public abstract class Magic {

	String name;
	int availableLevel;
	double damageMod;
	double healingMod;
	int currentCooldown;
	int maxCooldown;
	String effect;
	String element;
	
	enum EFFECTS {POISON, STATIC, BURN, FROZEN, WET, NONE};
	enum ELEMENTS {EARTH, LIGHTNING, FIRE, ICE, WATER, NONE};
	
	public Magic( String name, int level, int cooldown, double damageMod,
				String effect, String element) {
		setName(name);
		setAvailableLevel(level);
		setDamageMod(damageMod);
		setMaxCooldown(cooldown);
		setEffect(effect);
		setElement(element);
	}
	
	public Magic(String name, int level, int cooldown, double healingMod) {
		setName(name);
		setAvailableLevel(level);
		setMaxCooldown(cooldown);
		setHealingMod(healingMod);
	}
	
	private void setAvailableLevel(int level) {
		availableLevel = level;
	}

	int useTech(int magicValue) {
		double damage = magicValue * damageMod;
		setCurrentCooldown(maxCooldown);
		return (int)damage;
	}

	private void setCurrentCooldown(int cooldown) {
		currentCooldown = cooldown;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDamageMod() {
		return damageMod;
	}

	public void setDamageMod(double damageMod) {
		this.damageMod = damageMod;
	}
	
	public double getHealingMod() {
		return healingMod;
	}
	
	public int getAvailableLevel() {
		return availableLevel;
	}

	public int getCurrentCooldown() {
		return currentCooldown;
	}

	public void setHealingMod(double healingMod) {
		this.healingMod = healingMod;
	}

	public int getMaxCooldown() {
		return maxCooldown;
	}

	public void setMaxCooldown(int cooldown) {
		this.maxCooldown = cooldown;
	}

	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}
	
}
