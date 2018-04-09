import java.util.Random;

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
public static final int KREC_MAX = 2;
public static final int ERICK_MIN = 1;
public static final int ERICK_MAX = 2;
public static final int LEUC_MIN = 1;
public static final int LEUC_MAX = 2;
public static final int M_LAVA_MIN = 1;
public static final int M_LAVA_MAX = 2;
public static final int L_GAUNTLETS_MIN = 1;
public static final int L_GAUNTLETS_MAX = 2;
public static final int FLAME_KEY_MIN = 1;
public static final int FLAME_KEY_MAX = 2;
public static final int FLAME_POTION_MIN = 1;
public static final int FLAME_POTION_MAX = 2;
public static final int BREEZE_KEY_MIN = 1;
public static final int BREEZE_KEY_MAX = 2;
public static final int FANCY_POTION__MIN = 1;
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

// Methods for Weapons

public static Weapon getEI01() {
if (EI01 == null) {
EI01 = new Weapon("Armor", ARMOR_MIN, ARMOR_MAX, 1, true, true, false, true);
}
return EI01;
}

public static Weapon getEI02 () {
if (EI02 == null) {
EI02 = new Weapon("Sword", SWORD_MIN, SWORD_MAX, 1, true, true, false, true);
}
return EI02;
}

public static Weapon getEI03() {
if (EI03 == null) {
EI03 = new Weapon("Torture Key", TORTURE_KEY_MIN, TORTURE_KEY_MAX, 1, true, true, false, true);
}
return EI03;
}

public static Weapon getEI04 () {
if (EI04 == null) {
EI04 = new Weapon("Water Bucket", WATER_BUCKET_MIN, WATER_BUCKET_MAX, 1, true, true, false, true);
}
return EI04;
} 
}
