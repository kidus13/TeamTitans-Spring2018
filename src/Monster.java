import java.util.Random;

public class Monster {
	static Random randomNum = new Random();

	/*** Attributes ***/

	private static String name;
	private static int monsterHP;
	private static int monsterAP;
	private Weapon weapon;
	Weapon w = new Weapon("",  0, 0, 0, 0, 0, false, false, false, false);
	Character c = new Character("", 0, 0);
	
	private static Monster EM01 = null;
	private static Monster EM02 = null;
	private static Monster EM03 = null;
	private static Monster WM01 = null;
	private static Monster WM02 = null;
	private static Monster WM03 = null;
	private static Monster WM04 = null;
	private static Monster FM01 = null;
	private static Monster FM02 = null;
	private static Monster FM03 = null;
	private static Monster FM04 = null;
	private static Monster AM01 = null;
	private static Monster AM02 = null;
	private static Monster AM03 = null;
	private static Monster AM04 = null;
	private static Monster AM05 = null;
	
	

	/*** Methods ***/

	// constructor
	public Monster(String _name, int _monsterHP, int _monsterAP) {
		name = _name;
		monsterHP = _monsterHP;
		monsterAP = _monsterAP;
	}

	public String getName() {
		return name;
	}

	public int getMonsterHP() {
		return monsterHP;
	}

	public static int getMonsterAP() {
		return monsterAP;
	}

	public int decreaseMPH(int decreasePoints) /* not sure how to implement this yet */
	{
		
		int weaponDamage = 0;
		int attackPoints = 100;
		int monsterHP = getMonsterHP();
		int decreaseMHP = monsterHP - (weaponDamage + attackPoints);
		return decreaseMHP;
				
	}

	public Weapon getWeapon() {
		return weapon;
	}

	// enemy attacks player
//	public void attack(Player _player) {
//		int weaponDamage = weapon.getDamage();
//		int attack = strength + weaponDamage;


	public boolean isDefeated() {
		if (monsterHP <= 0) {
			return true;
		}
		return false;
	}

	// method for weapon dropped by monster
	public boolean dropWeapon() /* need to figure out if this is correct */
	{
		if (monsterHP <= 0) {
			return true;
		}
		return false;
	}

	// which method is called depends on which path is taken
	public static int getDamageToPlayer() {
		return randomNum.nextInt(1) + getMonsterAP();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Monster [Name = " + getName() + ", Health Points =" + getMonsterHP() + ", Attack Points = " + getMonsterAP() + "]";
	}

	// Monster Methods

	public static Monster getEM01() {
		{
			EM01 = new Monster("Guard", 10, 2);
		}
		return EM01;
	}

	public static Monster getEM02() {
		{
			EM02 = new Monster("Jailer", 10, 1);
		}
		return EM02;
	}

	public static Monster getEM03() {
		{
			EM03 = new Monster("Earth Golem", 200, 1);
		}
		return EM03;
	}

	public static Monster getWM01() {
		{
			WM01 = new Monster("Cenor c11", 150, 35);
		}
		return WM01;
	}

	public static Monster getWM02() {
		{
			WM02 = new Monster("Cenor c12", 175, 45);
		}
		return WM02;
	}

	public static Monster getWM03() {
		{
			WM03 = new Monster("LyyFx", 250, 50);
		}
		return WM03;
	}

	public static Monster getWM04() {
		{
			WM04 = new Monster("ArGhai", 300, 75);
		}
		return WM04;
	}
	
	public static Monster getFM01() {
		{
			FM01 = new Monster("Fire Lord Alucard", 315, 100);
		}
		return FM01;
	}

	public static Monster getFM02() {
		{
			FM02 = new Monster("Ultimate HellFire Beast", 350, 85);
		}
		return FM02;
	}

	public static Monster getFM03() {
		{
			FM03 = new Monster("Lava Queen Fluffy", 400, 150);
		}
		return FM03;
	}

	public static Monster getFM04() {
		{
			FM04 = new Monster("Treasure Keeper Absolute Blue", 500, 100);
		}
		return FM04;
	}

	public static Monster getAM01() {
		{
			AM01 = new Monster("Penguin Guard", 415, 100);
		}
		return AM01;
	}

	public static Monster getAM02() {
		{
			AM02 = new Monster("Bat Squire", 450, 125);
		}
		return AM02;
	}

	public static Monster getAM03() {
		{
			AM03 = new Monster("Veteran Eagle", 475, 150);
		}
		return AM03;
	}

	public static Monster getAM04() {
		{
			AM04 = new Monster("King Flightgrand IV", 550, 200);
		}
		return AM04;
	}

	public static Monster getAM05() {
		{
			AM05 = new Monster("King Flightgrand IV", 1000, 200);
		}
		return AM05;
	}


}
