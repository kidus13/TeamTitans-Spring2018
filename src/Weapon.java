import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Weapon {

	/*** Public Constants ***/

	public static final int ARMOR_MIN = 1;
	public static final int ARMOR_MAX = 2;
	public static final int SWORD_MIN = 1;
	public static final int SWORD_MAX = 2;
	public static final int TORTURE_KEY_MIN = 1;
	public static final int TORTURE_KEY_MAX = 2;
	public static final int WATER_BUCKET_MIN = 1;
	public static final int WATER_BUCKET_MAX = 2;
	public static final int CELL_KEY_MIN = 1;
	public static final int CELL_KEY_MAX = 2;
	public static final int EARTHEN_HELMET_MIN = 1;
	public static final int EARTHEN_HELMET_MAX = 2;
	public static final int HEALTH_POTION_MIN = 1;
	public static final int HEALTH_POTION_MAX = 2;
	public static final int FUNDA_MIN = 1;
	public static final int FUNDA_MAX = 2;
	public static final int XIPHOS_MIN = 1;
	public static final int XIPHOS_MAX = 1;
	public static final int ACTINOLITE_MIN = 1;
	public static final int ACTINOLITE_MAX = 2;
	public static final int CREK_MIN = 1;
	public static final int CREK_MAX = 2;
	public static final int KREC_MIN = 1;
	public static final int KREC_MAX = 2;
	public static final int ERCK_MIN = 1;
	public static final int ERCK_MAX = 2;
	public static final int LEUCK_MIN = 1;
	public static final int LEUCK_MAX = 2;
	public static final int MOLTEN_LAVA_SWORD_MIN = 1;
	public static final int MOLTEN_LAVA_SWORD_MAX = 2;
	public static final int LAVA_GAUNTLETS_MIN = 1;
	public static final int LAVA_GAUNTLETS_MAX = 2;
	public static final int FLAME_KEY_MIN = 1;
	public static final int FLAME_KEY_MAX = 2;
	public static final int FLAME_POTION_MIN = 1;
	public static final int FLAME_POTION_MAX = 2;
	public static final int BREEZE_KEY_MIN = 1;
	public static final int BREEZE_KEY_MAX = 2;
	public static final int FANCY_POTION_MIN = 1;
	public static final int FANCY_POTION_MAX = 2;
	public static final int SHOP_KEY_MIN = 1;
	public static final int SHOP_KEY_MAX = 2;
	public static final int WINGS_MIN = 1;
	public static final int WINGS_MAX = 2;
	public static final int GILDED_SWORD_MIN = 1;
	public static final int GILDED_SWORD_MAX = 2;
	public static final int GILDED_PLATE_MIN = 1;
	public static final int GILDED_PLATE_MAX = 2;
	public static final int GILDED_HELM_MIN = 1;
	public static final int GILDED_HELM_MAX = 2;

	/*** Attributes ***/

	private String name;
	private int minDamage;
	private int maxDamage;
	private int tradeValue;
	private boolean equipable;
	private boolean droppable;
	private boolean useable;
	private boolean tradable;

	private static Weapon EI01 = null;
	private static Weapon EI02 = null;
	private static Weapon EI03 = null;
	private static Weapon EI04 = null;
	private static Weapon EI05 = null;
	private static Weapon EI06 = null;
	private static Weapon EI07 = null;

	private static Weapon WI01 = null;
	private static Weapon WI02 = null;
	private static Weapon WI03 = null;
	private static Weapon WI04 = null;
	private static Weapon WI05 = null;
	private static Weapon WI06 = null;
	private static Weapon WI07 = null;

	private static Weapon FI01 = null;
	private static Weapon FI02 = null;
	private static Weapon FI03 = null;
	private static Weapon FI04 = null;

	private static Weapon AI01 = null;
	private static Weapon AI02 = null;
	private static Weapon AI03 = null;
	private static Weapon AI04 = null;
	private static Weapon AI05 = null;
	private static Weapon AI06 = null;
	private static Weapon AI07 = null;
	private static Weapon AI08 = null;

	/*** Methods ***/

	// constructor
	public Weapon(String _name, int _minDamage, int _maxDamage, int _tradeValue, boolean _equipable, boolean _droppable,
			boolean _useable, boolean _tradable) {
		name = _name;
		minDamage = _minDamage;
		maxDamage = _maxDamage;
		tradeValue = _tradeValue;
		equipable = _equipable;
		droppable = _droppable;
		useable = _useable;
		tradable = _tradable;
	}

	public String getName() {
		return name;
	}

	public int getMinDamage() {
		return minDamage;
	}

	public int getMaxDamage() {
		return maxDamage;
	}

	public int getTradeValue() {
		return tradeValue;
	}

	public boolean isEquipable() {
		return equipable;
	}

	public boolean isDroppable() {
		return droppable;
	}

	public boolean isUseable() {
		return useable;
	}

	public boolean isTradable() {
		return tradable;
	}

	// weapon damage (max-min... random number)
	public int getDamage() {
		Random randomNum = new Random();
		return randomNum.nextInt(maxDamage - minDamage + 1);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Weapon [Type = " + getName() + ", Trade Value = " + getTradeValue() + ", Equipable = " + isEquipable()
				+ ", Droppable =" + isDroppable() + ", Useable = " + isUseable() + ", Tradable =" + isTradable()
				+ ", Damage = " + getDamage() + "]";
	}

	// Methods for Weapons

	public static void getEI01() {
		{
			EI01 = new Weapon("Armor", ARMOR_MIN, ARMOR_MAX, 1, true, true, false, true);
		}
		System.out.println(EI01);
	}

	public static void getEI02() {
		{
			EI02 = new Weapon("Sword", SWORD_MIN, SWORD_MAX, 1, true, true, false, true);
		}
		System.out.println(EI02);
	}

	public static void getEI03() {
		{
			EI03 = new Weapon("Torture Key", TORTURE_KEY_MIN, TORTURE_KEY_MAX, 1, true, true, false, true);
		}
		System.out.println(EI03);
	}

	public static void getEI04() {
		{
			EI04 = new Weapon("Water Bucket", WATER_BUCKET_MIN, WATER_BUCKET_MAX, 1, true, true, false, true);
		}
		System.out.println(EI04);
	}

	public static void getEI05() {
		{
			EI05 = new Weapon("Cell Key", CELL_KEY_MIN, CELL_KEY_MAX, 1, false, true, true, false);
		}
		System.out.println(EI05);
	}

	public static void getEI06() {
		{
			EI06 = new Weapon("Earthen Helmet", EARTHEN_HELMET_MIN, EARTHEN_HELMET_MAX, 1, true, true, false, true);
		}
		System.out.println (EI06);
	}

	public static void getEI07() {
		 {
			EI07 = new Weapon("Health Potion", HEALTH_POTION_MIN, HEALTH_POTION_MAX, 1, false, true, true, true);
		 }
		 System.out.println (EI07);
	}

	public static void getWI01() {
		{
			WI01 = new Weapon("Funda", FUNDA_MIN, FUNDA_MAX, 1, true, true, true, true);
		}
		System.out.println (WI01);
	}

	public static void getWI02() {
		{
			WI02 = new Weapon("Xiphos", XIPHOS_MIN, XIPHOS_MAX, 1, true, true, true, true);
		}
		System.out.println (WI02);
	}

	public static void getWI03() {
		{
			WI03 = new Weapon("Actinolite", ACTINOLITE_MIN, ACTINOLITE_MIN, 1, true, true, true, true);
		}
		System.out.println (WI03);
	}

	public static void getWI04() {
		{
			WI04 = new Weapon("Crek", CREK_MIN, CREK_MAX, 1, true, true, true, true);
		}
		System.out.println (WI04);
	}

	public static void getWI05() {
		{
			WI05 = new Weapon("Krec", KREC_MIN, KREC_MAX, 1, true, true, true, true);
		}
		System.out.println (WI05);
	}

	public static void getWI06() {
		{
			WI06 = new Weapon("Erck", ERCK_MIN, ERCK_MAX, 1, true, true, true, true);
		}
		System.out.println (WI06);
	}

	public static void getWI07() {
		{
			WI07 = new Weapon("Leuck", LEUCK_MIN, LEUCK_MAX, 1, true, true, true, true);
		}
		System.out.println (WI07);
	}

	public static void getFI01() {
		{
			FI01 = new Weapon("Molten Lava Sword", MOLTEN_LAVA_SWORD_MIN, MOLTEN_LAVA_SWORD_MAX, 1, true, true, false,
					true);
		}
		System.out.println (FI01);
	}

	public static void getFI02() {
		{
			FI02 = new Weapon("Lava Gauntlets", LAVA_GAUNTLETS_MIN, LAVA_GAUNTLETS_MAX, 1, true, true, false, true);
		}
		System.out.println (FI02);
	}

	public static void getFI03() {
		{
			FI03 = new Weapon("Flame Key", FLAME_KEY_MIN, FLAME_KEY_MAX, 1, false, true, true, true);
		}
		System.out.println (FI03);
	}

	public static void getFI04() {
		{
			FI04 = new Weapon("Flame Potion", FLAME_POTION_MIN, FLAME_POTION_MAX, 1, false, true, true, true);
		}
		System.out.println (FI04);
	}

	public static void getAI01() {
		{
			AI01 = new Weapon("Breeze Key", BREEZE_KEY_MIN, BREEZE_KEY_MAX, 1, false, false, true, true);
		}
		System.out.println (AI01);
	}

	public static void getAI02() {
		{
			AI02 = new Weapon("Fancy Potion", FANCY_POTION_MIN, FANCY_POTION_MAX, 1, false, true, true, true);
		}
		System.out.println (AI02);
	}

	public static void getAI03() {
		{
			AI03 = new Weapon("Cell Key", CELL_KEY_MIN, CELL_KEY_MAX, 1, false, false, true, false);
		}
		System.out.println (AI03);
	}

	public static void getAI04() {
		{
			AI04 = new Weapon("Shop Key", SHOP_KEY_MIN, SHOP_KEY_MAX, 1, false, true, true, false);
		}
		System.out.println (AI04);
	}

	public static void getAI05() {
		{
			AI05 = new Weapon("Crown of Wings", WINGS_MIN, WINGS_MAX, 1, true, true, true, true);
		}
		System.out.println (AI05);
	}

	public static void getAI06() {
		{
			AI06 = new Weapon("Gilded Sword", GILDED_SWORD_MIN, GILDED_SWORD_MAX, 1, true, true, true, true);
		}
		System.out.println (AI06);
	}

	public static void getAI07() {
		{
			AI07 = new Weapon("Gilded Plate", GILDED_PLATE_MIN, GILDED_PLATE_MAX, 1, true, true, true, true);
		}
		System.out.println (AI07);
	}

	public static void getAI08() {
		{
			AI08 = new Weapon("Gilded Helm", GILDED_HELM_MIN, GILDED_HELM_MAX, 1, true, true, true, true);
		}
		System.out.println (AI08);
	}
}
