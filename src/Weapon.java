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

public static Weapon getEI05() {
if (EI05 == null) {
EI05 = new Weapon("Cell Key", CELL_KEY_MIN, CELL_KEY_MAX, 1, false, true, true, false);
}
return EI05;
}

public static Weapon getEI06() {
if (EI06 == null) {
EI06 = new Weapon("Earthen Helmet", EARTHEN_HELMET_MIN, EARTHEN_HELMET_MAX, 1, true, true, false, true);
}
return EI06;
}

public static Weapon getEI07() {
if (EI07 == null) {
EI07 = new Weapon("Health Potion", HEALTH_POTION_MIN, HEALTH_POTION_MAX, 1, false, true, true, true);
}
return EI07;
}

public static Weapon getWI01() {
if (WI01 == null) {
WI01 = new Weapon("Funda", FUNDA_MIN, FUNDA_MAX, 1, true, true, true, true);
}
return WI01;
}

public static Weapon getWI02() {
if (WI02 == null) {
WI02 = new Weapon("Xiphos", XIPHOS_MIN, XIPHOS_MAX, 1, true, true, true, true);
}
return WI02;
}

public static Weapon getWI03() {
if (WI03 == null) {
WI03 = new Weapon("Actinolite", ACTINOLITE_MIN, ACTINOLITE_MIN, 1, true, true, true, true);
}
return WI03;
}

public static Weapon getWI04() {
if (WI04 == null) {
WI04 = new Weapon("Crek", CREK_MIN, CREK_MAX, 1, true, true, true, true);
}
return WI04;
}

public static Weapon getWI05() {
if (WI05 == null) {
WI05 = new Weapon("Krec", KREC_MIN, KREC_MAX, 1, true, true, true, true);
}
return WI05;
}

public static Weapon getWI06() {
if (WI06 == null) {
WI06 = new Weapon("Erck", ERCK_MIN, ERCK_MAX, 1, true, true, true, true);
}
return WI06;
}

public static Weapon getWI07() {
if (WI07 == null) {
WI07 = new Weapon("Leuck", LEUCK_MIN, LEUCK_MAX, 1, true, true, true, true);
}
return WI07;
}

public static Weapon getFI01() {
if (FI01 == null) {
FI01 = new Weapon("Molten Lava Sword", MOLTEN_LAVA_SWORD_MIN, MOLTEN_LAVA_SWORD_MAX, 1, true, true, false,
true);
}
return FI01;
}

public static Weapon getFI02() {
if (FI02 == null) {
FI02 = new Weapon("Lava Gauntlets", LAVA_GAUNTLETS_MIN, LAVA_GAUNTLETS_MAX, 1, true, true, false, true);
}
return FI02;
}

public static Weapon getFI03() {
if (FI03 == null) {
FI03 = new Weapon("Flame Key", FLAME_KEY_MIN, FLAME_KEY_MAX, 1, false, true, true, true);
}
return FI03;
}

public static Weapon getFI04() {
if (FI04 == null) {
FI04 = new Weapon("Flame Potion", FLAME_POTION_MIN, FLAME_POTION_MAX, 1, false, true, true, true);
}
return FI04;
}

public static Weapon getAI01() {
if (AI01 == null) {
AI01 = new Weapon("Breeze Key", BREEZE_KEY_MIN, BREEZE_KEY_MAX, 1, false, false, true, true);
}
return AI01;
}

public static Weapon getAI02() {
if (AI02 == null) {
AI02 = new Weapon("Fancy Potion", FANCY_POTION_MIN, FANCY_POTION_MAX, 1, false, true, true, true);
}
return AI02;
}

public static Weapon getAI03() {
if (AI03 == null) {
AI03 = new Weapon("Cell Key", CELL_KEY_MIN, CELL_KEY_MAX, 1, false, false, true, false);
}
return AI03;
}

public static Weapon getAI04() {
if (AI04 == null) {
AI04 = new Weapon("Shop Key", SHOP_KEY_MIN, SHOP_KEY_MAX, 1, false, true, true, false);
}
return AI04;
}

public static Weapon getAI05() {
if (AI05 == null) {
AI05 = new Weapon("Crown of Wings", WINGS_MIN, WINGS_MAX, 1, true, true, true, true);
}
return AI05;
}

public static Weapon getAI06() {
if (AI06 == null) {
AI06 = new Weapon("Gilded Sword", GILDED_SWORD_MIN, GILDED_SWORD_MAX, 1, true, true, true, true);
}
return AI06;
}

public static Weapon getAI07() {
if (AI07 == null) {
AI07 = new Weapon("Gilded Plate", GILDED_PLATE_MIN, GILDED_PLATE_MAX, 1, true, true, true, true);
}
return AI07;
}

public static Weapon getAI08() {
if (AI08 == null) {
AI08 = new Weapon("Gilded Helm", GILDED_HELM_MIN, GILDED_HELM_MAX, 1, true, true, true, true);
}
return AI08;
}
}
