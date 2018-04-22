
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Random;

public class Weapon implements Serializable {

	/*** Public Constants ***/

	public static final int ARMOR_DEFENSE = 2;
	public static final int ARMOR_HEALTH = 5;
	public static final int ARMOR_MIN = 0;
	public static final int ARMOR_MAX = 0;
	public static final int SWORD_DEFENSE = 0;
	public static final int SWORD_HEALTH = 0;
	public static final int SWORD_MIN = 2;
	public static final int SWORD_MAX = 2;
	public static final int TORTURE_KEY_DEFENSE = 0;
	public static final int TORTURE_KEY_HEALTH = 0;
	public static final int TORTURE_KEY_MIN = 0;
	public static final int TORTURE_KEY_MAX = 0;
	public static final int WATER_BUCKET_DEFENSE = 0;
	public static final int WATER_BUCKET_HEALTH = 0;
	public static final int WATER_BUCKET_MIN = 180;
	public static final int WATER_BUCKET_MAX = 180;
	public static final int CELL_KEY1_DEFENSE = 0;
	public static final int CELL_KEY1_HEALTH = 0;
	public static final int CELL_KEY1_MIN = 0;
	public static final int CELL_KEY1_MAX = 0;
	public static final int EARTHEN_HELMET_DEFENSE = 7;
	public static final int EARTHEN_HELMET_HEALTH = 20;
	public static final int EARTHEN_HELMET_MIN = 0;
	public static final int EARTHEN_HELMET_MAX = 0;
	public static final int HEALTH_POTION_DEFENSE = 0;
	public static final int HEALTH_POTION_HEALTH = 10;
	public static final int HEALTH_POTION_MIN = 0;
	public static final int HEALTH_POTION_MAX = 0;

	public static final int FUNDA_DEFENSE = 0;
	public static final int FUNDA_HEALTH = 0;
	public static final int FUNDA_MIN = 0;
	public static final int FUNDA_MAX = 0;
	public static final int XIPHOS_DEFENSE = 0;
	public static final int XIPHOS_HEALTH = 0;
	public static final int XIPHOS_MIN = 0;
	public static final int XIPHOS_MAX = 0;
	public static final int ACTINOLITE_DEFENSE = 0;
	public static final int ACTINOLITE_HEALTH = 0;
	public static final int ACTINOLITE_MIN = 250;
	public static final int ACTINOLITE_MAX = 250;
	public static final int CREK_DEFENSE = 0;
	public static final int CREK_HEALTH = 10;
	public static final int CREK_MIN = 150;
	public static final int CREK_MAX = 300;
	public static final int KREC_DEFENSE = 0;
	public static final int KREC_HEALTH = 10;
	public static final int KREC_MIN = 0;
	public static final int KREC_MAX = 0;
	public static final int ERCK_DEFENSE = 0;
	public static final int ERCK_HEALTH = 0;
	public static final int ERCK_MIN = 25;
	public static final int ERCK_MAX = 50;
	public static final int LEUCK_DEFENSE = 0;
	public static final int LEUCK_HEALTH = 0;
	public static final int LEUCK_MIN = 0;
	public static final int LEUCK_MAX = 0;

	public static final int MOLTEN_LAVA_SWORD_DEFENSE = 0;
	public static final int MOLTEN_LAVA_SWORD_HEALTH = 0;
	public static final int MOLTEN_LAVA_SWORD_MIN = 25;
	public static final int MOLTEN_LAVA_SWORD_MAX = 75;
	public static final int LAVA_GAUNTLETS_DEFENSE = 0;
	public static final int LAVA_GAUNTLETS_HEALTH = 0;
	public static final int LAVA_GAUNTLETS_MIN = 0;
	public static final int LAVA_GAUNTLETS_MAX = 0;
	public static final int FLAME_KEY_DEFENSE = 0;
	public static final int FLAME_KEY_HEALTH = 0;
	public static final int FLAME_KEY_MIN = 0;
	public static final int FLAME_KEY_MAX = 0;
	public static final int FLAME_POTION_DEFENSE = 0;
	public static final int FLAME_POTION_HEALTH = 150;
	public static final int FLAME_POTION_MIN = 0;
	public static final int FLAME_POTION_MAX = 0;

	public static final int BREEZE_KEY_DEFENSE = 0;
	public static final int BREEZE_KEY_HEALTH = 0;
	public static final int BREEZE_KEY_MIN = 0;
	public static final int BREEZE_KEY_MAX = 0;
	public static final int FANCY_POTION_DEFENSE = 0;
	public static final int FANCY_POTION_HEALTH = 0;
	public static final int FANCY_POTION_MIN = 0;
	public static final int FANCY_POTION_MAX = 0;
	public static final int CELL_KEY2_DEFENSE = 0;
	public static final int CELL_KEY2_HEALTH = 0;;
	public static final int CELL_KEY2_MIN = 0;
	public static final int CELL_KEY2_MAX = 0;
	public static final int SHOP_KEY_DEFENSE = 0;
	public static final int SHOP_KEY_HEALTH = 0;
	public static final int SHOP_KEY_MIN = 0;
	public static final int SHOP_KEY_MAX = 0;
	public static final int WINGS_DEFENSE = 0;
	public static final int WINGS_HEALTH = 0;
	public static final int WINGS_MIN = 100;
	public static final int WINGS_MAX = 175;
	public static final int GILDED_SWORD_DEFENSE = 0;
	public static final int GILDED_SWORD_HEALTH = 0;
	public static final int GILDED_SWORD_MIN = 125;
	public static final int GILDED_SWORD_MAX = 200;
	public static final int GILDED_PLATE_DEFENSE = 0;
	public static final int GILDED_PLATE_HEALTH = 50;
	public static final int GILDED_PLATE_MIN = 0;
	public static final int GILDED_PLATE_MAX = 0;
	public static final int GILDED_HELM_DEFENSE = 0;
	public static final int GILDED_HELM_HEALTH = 50;
	public static final int GILDED_HELM_MIN = 0;
	public static final int GILDED_HELM_MAX = 0;

	/*** Attributes ***/

	private String name;
	private int addDefense;
	private int addHealth;
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
	public Weapon(String _name, int _addDefense, int _addHealth, int _minDamage, int _maxDamage, int _tradeValue,
			boolean _equipable, boolean _droppable, boolean _useable, boolean _tradable) {
		name = _name;
		addDefense = _addDefense;
		addHealth = _addHealth;
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

	public int getAddDefense() {
		return addDefense;
	}

	public int getAddHealth() {
		return addHealth;
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

	public void savedInv() throws ClassNotFoundException {

		try {
			Weapon w = new Weapon(getName(), getAddDefense(), getAddHealth(), getMinDamage(), getMaxDamage(),
					getTradeValue(), isEquipable(), isDroppable(), isUseable(), isTradable());
			Battle b = new Battle();

			FileOutputStream fos2 = new FileOutputStream("save2.txt");

			ObjectOutputStream oos2 = new ObjectOutputStream(fos2);
			for (int i = 0; i < b.getInv().size(); i++) {
				oos2.writeObject(b.getInv().get(i));
			}
			oos2.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void loadInv() throws ClassNotFoundException {
		Weapon weapon;
		try {

			FileInputStream fis2 = new FileInputStream("save2.txt");

			ObjectInputStream ois2 = new ObjectInputStream(fis2);
			Battle b = new Battle();

			// weapon = (Weapon) ois2.readObject();
			// b.getInv().add(weapon);
			// List<Weapon> ds = (List<Weapon>)ois2.readObject();
			// b.getInv().addAll(ds);

			b.getInv().add((Weapon) ois2.readObject());

			for (int i = 0; i < b.getInv().size(); i++) {
				System.out.println(b.getInv().get(i) + "\n");
			}
			ois2.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

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
		return "Weapon [Type = " + getName() + ", Add Health = " + getAddHealth() + ", Equipable = " + isEquipable()
				+ ", Useable = " + isUseable() + ", Damage = " + getDamage() + "]";
	}

	// Methods for Weapons

	public static Weapon getEI01() {
		{
			EI01 = new Weapon("Armor", ARMOR_DEFENSE, ARMOR_HEALTH, ARMOR_MIN, ARMOR_MAX, 1, true, true, false, true);
		}
		return EI01;
	}

	public static Weapon getEI02() {
		{
			EI02 = new Weapon("Sword", SWORD_DEFENSE, SWORD_HEALTH, SWORD_MIN, SWORD_MAX, 1, true, true, false, true);
		}
		return EI02;
	}

	public static Weapon getEI03() {
		{
			EI03 = new Weapon("Torture Key", TORTURE_KEY_DEFENSE, TORTURE_KEY_HEALTH, TORTURE_KEY_MIN, TORTURE_KEY_MAX,
					0, true, true, false, true);
		}
		return EI03;
	}

	public static Weapon getEI04() {
		{
			EI04 = new Weapon("Water Bucket", WATER_BUCKET_DEFENSE, WATER_BUCKET_HEALTH, WATER_BUCKET_MIN,
					WATER_BUCKET_MAX, 0, true, true, false, true);
		}
		return EI04;
	}

	public static Weapon getEI05() {
		{
			EI05 = new Weapon("Cell Key1", CELL_KEY1_DEFENSE, CELL_KEY1_HEALTH, CELL_KEY1_MIN, CELL_KEY1_MAX, 0, false,
					true, true, false);
		}
		return EI05;
	}

	public static Weapon getEI06() {
		{
			EI06 = new Weapon("Earthen Helmet", EARTHEN_HELMET_DEFENSE, EARTHEN_HELMET_HEALTH, EARTHEN_HELMET_MIN,
					EARTHEN_HELMET_MAX, 3, true, true, false, true);
		}
		return EI06;
	}

	public static Weapon getEI07() {
		{
			EI07 = new Weapon("Health Potion", HEALTH_POTION_DEFENSE, HEALTH_POTION_HEALTH, HEALTH_POTION_MIN,
					HEALTH_POTION_MAX, 2, false, true, true, true);
		}
		return EI07;
	}

	public static Weapon getWI01() {
		{
			WI01 = new Weapon("Funda", FUNDA_DEFENSE, FUNDA_HEALTH, FUNDA_MIN, FUNDA_MAX, 6, true, true, true, true);
		}
		return WI01;
	}

	public static Weapon getWI02() {
		{
			WI02 = new Weapon("Xiphos", XIPHOS_DEFENSE, XIPHOS_HEALTH, XIPHOS_MIN, XIPHOS_MAX, 5, true, true, true,
					true);
		}
		return WI02;
	}

	public static Weapon getWI03() {
		{
			WI03 = new Weapon("Actinolite", ACTINOLITE_DEFENSE, ACTINOLITE_HEALTH, ACTINOLITE_MIN, ACTINOLITE_MIN, 5,
					true, true, true, true);
		}
		return WI03;
	}

	public static Weapon getWI04() {
		{
			WI04 = new Weapon("Crek", CREK_DEFENSE, CREK_HEALTH, CREK_MIN, CREK_MAX, 4, true, true, true, true);
		}
		return WI04;
	}

	public static Weapon getWI05() {
		{
			WI05 = new Weapon("Krec", KREC_DEFENSE, KREC_HEALTH, KREC_MIN, KREC_MAX, 3, true, true, true, true);
		}
		return WI05;
	}

	public static Weapon getWI06() {
		{
			WI06 = new Weapon("Erck", ERCK_DEFENSE, ERCK_HEALTH, ERCK_MIN, ERCK_MAX, 3, true, true, true, true);
		}
		return WI06;
	}

	public static Weapon getWI07() {
		{
			WI07 = new Weapon("Leuck", LEUCK_DEFENSE, LEUCK_HEALTH, LEUCK_MIN, LEUCK_MAX, 3, true, true, true, true);
		}
		return WI07;
	}

	public static Weapon getFI01() {
		{
			FI01 = new Weapon("Molten Lava Sword", MOLTEN_LAVA_SWORD_DEFENSE, MOLTEN_LAVA_SWORD_HEALTH,
					MOLTEN_LAVA_SWORD_MIN, MOLTEN_LAVA_SWORD_MAX, 7, true, true, false, true);
		}
		return FI01;
	}

	public static Weapon getFI02() {
		{
			FI02 = new Weapon("Lava Gauntlets", LAVA_GAUNTLETS_DEFENSE, LAVA_GAUNTLETS_HEALTH, LAVA_GAUNTLETS_MIN,
					LAVA_GAUNTLETS_MAX, 8, true, true, false, true);
		}
		return FI02;
	}

	public static Weapon getFI03() {
		{
			FI03 = new Weapon("Flame Key", FLAME_KEY_DEFENSE, FLAME_KEY_HEALTH, FLAME_KEY_MIN, FLAME_KEY_MAX, 9, false,
					true, true, true);
		}
		return FI03;
	}

	public static Weapon getFI04() {
		{
			FI04 = new Weapon("Flame Potion", FLAME_POTION_DEFENSE, FLAME_POTION_HEALTH, FLAME_POTION_MIN,
					FLAME_POTION_MAX, 4, false, true, true, true);
		}
		return FI04;
	}

	public static Weapon getAI01() {
		{
			AI01 = new Weapon("Breeze Key", BREEZE_KEY_DEFENSE, BREEZE_KEY_HEALTH, BREEZE_KEY_MIN, BREEZE_KEY_MAX, 0,
					false, false, true, true);
		}
		return AI01;
	}

	public static Weapon getAI02() {
		{
			AI02 = new Weapon("Fancy Potion", FANCY_POTION_DEFENSE, FANCY_POTION_HEALTH, FANCY_POTION_MIN,
					FANCY_POTION_MAX, 0, false, true, true, true);
		}
		return AI02;
	}

	public static Weapon getAI03() {
		{
			AI03 = new Weapon("Cell Key2", CELL_KEY2_DEFENSE, CELL_KEY2_HEALTH, CELL_KEY2_MIN, CELL_KEY2_MAX, 10, false,
					false, true, false);
		}
		return AI03;
	}

	public static Weapon getAI04() {
		{
			AI04 = new Weapon("Shop Key", SHOP_KEY_DEFENSE, SHOP_KEY_HEALTH, SHOP_KEY_MIN, SHOP_KEY_MAX, 0, false, true,
					true, false);
		}
		return AI04;
	}

	public static Weapon getAI05() {
		{
			AI05 = new Weapon("Crown of Wings", WINGS_DEFENSE, WINGS_HEALTH, WINGS_MIN, WINGS_MAX, 11, true, true, true,
					true);
		}
		return AI05;
	}

	public static Weapon getAI06() {
		{
			AI06 = new Weapon("Gilded Sword", GILDED_SWORD_DEFENSE, GILDED_SWORD_HEALTH, GILDED_SWORD_MIN,
					GILDED_SWORD_MAX, 12, true, true, true, true);
		}
		return AI06;
	}

	public static Weapon getAI07() {
		{
			AI07 = new Weapon("Gilded Plate", GILDED_PLATE_DEFENSE, GILDED_PLATE_HEALTH, GILDED_PLATE_MIN,
					GILDED_PLATE_MAX, 11, true, true, true, true);
		}
		return AI07;
	}

	public static Weapon getAI08() {
		{
			AI08 = new Weapon("Gilded Helm", GILDED_HELM_DEFENSE, GILDED_HELM_HEALTH, GILDED_HELM_MIN, GILDED_HELM_MAX,
					10, true, true, true, true);
		}
		return AI08;
	}
}
