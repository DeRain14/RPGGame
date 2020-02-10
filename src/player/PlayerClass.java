package player;
import java.util.Random;


public abstract class PlayerClass {
	
	public int lvl = 1;
	public String name;
	Random mod = new Random();
	int BASE_HP = 100;
	int HP;
	int BASE_ATTACK = 20;
	int attack;
	int BASE_MAGIC = 10;
	int magic;
	int BASE_DEFENSE = 20;
	int defense;
	int BASE_MAG_DEFENSE = 15;
	int magDefense;
	int BASE_SPEED = 25;
	int speed;
	
	public PlayerClass(String name) {
		this.name = name;
		HP = BASE_HP;
		attack = BASE_ATTACK;
		magic = BASE_MAGIC;
		defense = BASE_DEFENSE;
		magDefense = BASE_MAG_DEFENSE;
		speed = BASE_SPEED;
	}	

	public String getClassType() {
		return "none";
	}

	public void setHP(int hp) {
		HP = hp;
	}
	
	public void setAttack(int att) {
		attack = att;
	}
	
	public void setDefense(int def) {
		defense = def;
	}
	
	public void setMagic(int mag) {
		magic = mag;
	}
	
	public void setMagDefense(int magDef) {
		magDefense = magDef;
	}
	
	public void setSpeed(int spd) {
		speed = spd;
	}
	
	public int getHP() {
		return HP;
	}
	
	public int getAttack() {
		return attack;
	}
	
	public int getDefense() {
		return defense;
	}
	
	public int getMagic() {
		return magic;
	}
	
	public int getMagDefense() {
		return magDefense;
	}
	
	public int getSpeed() {
		return speed;
	}
	
}
