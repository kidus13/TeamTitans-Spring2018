import java.util.Random;

public class Monster {
	static Random randomNum = new Random();

	/*** Attributes ***/

	private String name;
	private int healthPoints;
	private static int attackPoints;
	private Weapon weapon;

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
	private static Monster mAM05 = null;

	/*** Methods ***/

	// constructor
	public Monster(String _name, int _healthPoints, int _attackPoints) {
		name = _name;
		healthPoints = _healthPoints;
		attackPoints = _attackPoints;
	}

	public String getName() {
		return name;
	}

	public int getHealthPoints() {
		return healthPoints;
	}

	public static int getAttackPoints() {
		return attackPoints;
	}

	public void decreaseHealthPoints(int decreasePoints) /* not sure how to implement this yet */
	{
		healthPoints -= decreasePoints;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	// enemy attacks player
	public void attack(Player _player) {
		int weaponDamage = weapon.getDamage();
		int attack = strength + weaponDamage;


	public boolean isDefeated() {
		if (healthPoints <= 0) {
			return true;
		}
		return false;
	}

	// method for weapon dropped by monster
	public boolean dropWeapon() /* need to figure out if this is correct */
	{
		if (healthPoints <= 0) {
			return true;
		}
		return false;
	}

	// which method is called depends on which path is taken
	public static int getDamageToPlayer() {
		return randomNum.nextInt(1) + getAttackPoints();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Monster [Name = " + getName() + ", Health Points =" + getHealthPoints() + "]";
	}

	// Monster Methods

	public static void getEM01() {
		{
			EM01 = new Monster("Guard", 100, 20);
		}
		System.out.println(EM01);
	}

	public static void getEM02() {
		{
			EM02 = new Monster("Jailer", 100, 20);
		}
		System.out.println(EM02);
	}

	public static void getEM03() {
		{
			EM03 = new Monster("Earth Golem", 100, 20);
		}
		System.out.println(EM03);
	}

	public static void getWM01() {
		{
			WM01 = new Monster("Cenor c11", 100, 20);
		}
		System.out.println(WM01);
	}

	public static void getWM02() {
		{
			WM02 = new Monster("Cenor c12", 100, 20);
		}
		System.out.println(WM02);
	}

	public static void getWM03() {
		{
			WM03 = new Monster("LyyFx", 100, 20);
		}
		System.out.println(WM03);
	}

	public static void getWM04() {
		{
			WM04 = new Monster("ArGhai", 100, 20);
		}
		System.out.println(WM04);
	}

}