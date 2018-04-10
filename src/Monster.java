import java.util.Random;

public class Monster {
	static Random randomNum = new Random();

	/*** Attributes ***/

	private String name;
	private int healthPoints;
	private static int attackPoints;
	private Weapon weapon;

	private static Monster EM01 = null;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Monster [getName()=" + getName() + ", getHelathPoints()=" + getHelathPoints() + ", getWeapon()="
				+ getWeapon() + ", isDefeated()=" + isDefeated() + ", dropWeapon()=" + dropWeapon() + "]";
	}

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
	public Monster(String _name, int _healthPoints, int _attackPoints, Object object) {
		name = _name;
		healthPoints = _healthPoints;
		attackPoints = _attackPoints;
		weapon = object;
	}

	public String getName() {
		return name;
	}

	public int getHelathPoints() {
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
		// need to implement this method
	}

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

	// Monster Methods

	public static Monster getEM01() {
		if (EM01 == null) {
			EM01 = new Monster("EM01", 100, 20, Weapon.getEI01());
		}
		return getEM01();
	}

	public static Monster getEM02() {
		if (EM02 == null) {
			EM02 = new Monster("EM02", 100, 10, Weapon.getCDKey());
		}
		return EM02;
	}

	public static Monster getEM03() {
		if (EM03 == null) {
			EM03 = new Monster("EM03", 100, 10, Weapon.getEarthenHelmet());
		}
		return EM03;
	}

	public static Monster getWM01() {
		if (WM01 == null) {
			WM01 = new Monster("WM01", 100, 30, null);
		}
		return WM01;
	}

	public static Monster getWM02() {
		if (WM02 == null) {
			WM02 = new Monster("WM02", 100, 40, null);
		}
		return WM02;
	}

	public static Monster getWM03() {
		if (WM03 == null) {
			WM03 = new Monster("WM03", 100, 70, null);
		}
		return WM03;
	}

	public static Monster getWM04() {
		if (WM04 == null) {
			WM04 = new Monster("WM04", 100, 50, null);
		}
		return WM04;
	}

	public static Monster getFM01() {
		if (FM01 == null) {
			FM01 = new Monster("FM01", 100, 50, null);
		}
		return FM01;
	}

	public static Monster getFM02() {
		if (FM02 == null) {
			FM02 = new Monster("FM02", 100, 50, null);
		}
		return FM02;
	}

	public static Monster getFM03() {
		if (FM03 == null) {
			FM03 = new Monster("FM03", 100, 50, null);
		}
		return FM03;
	}

	public static Monster getFM04() {
		if (FM04 == null) {
			FM04 = new Monster("FM04", 100, 50, null);
		}
		return FM04;
	}

	public static Monster getAM01() {
		if (AM01 == null) {
			AM01 = new Monster("AM01", 100, 50, null);
		}
		return AM01;
	}

	public static Monster getAM02() {
		if (AM02 == null) {
			AM02 = new Monster("AM01", 100, 50, null);
		}
		return AM02;
	}

	public static Monster getAM03() {
		if (AM03 == null) {
			AM03 = new Monster("AM03", 100, 50, null);
		}
		return AM03;
	}

	public static Monster getAM04() {
		if (AM04 == null) {
			AM04 = new Monster("AM04", 100, 50, null);
		}
		return AM04;
	}

	public static Monster getmAM05() {
		if (mAM05 == null) {
			mAM05 = new Monster("mAM05", 100, 50, null);
		}
		return mAM05;
	}

}