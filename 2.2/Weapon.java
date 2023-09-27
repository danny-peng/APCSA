public class Weapon {
    // instance variables
    private int dmg;
    private double sharpness;
    private double maxSharp;

    private int level = 1;
    private int maxLevel = 5;

    // constructors
    public Weapon(int dmg, double sharpness) {
        this.dmg = dmg;
        this.maxSharp = sharpness;
        this.sharpness = sharpness;
    }

    public Weapon(int dmg, double sharpness, int level) {
        this.dmg = dmg;
        this.maxSharp = sharpness;
        this.sharpness = sharpness;

        this.level = level;
    }
    
    public Weapon(int dmg, double sharpness, int level, int maxLevel) {
        this.dmg = dmg;
        this.maxSharp = sharpness;
        this.sharpness = sharpness;

        this.level = level;
        this.maxLevel = maxLevel;
    }

    // methods
    public int getDmg() {
        return dmg;
    }

    public double getSharpness() {
        return sharpness;
    }

    public void printStats() {
        System.out.println("DMG: " + dmg);
        System.out.println("Sharpness: " + sharpness + "/" + maxSharp);
        System.out.println("Level: " + level + "/" + maxLevel);
    }

    public void upgrade() {
        if (level >= 5) {
            System.out.println("Max level already!");
            return;
        }

        dmg = dmg + (dmg/level);
        level++;

        System.out.println("Upgraded! \nIt is now level " + level + "/" + maxLevel);
        System.out.println("Damage: " + dmg);
    }

    public void sharpen() {
        sharpness = maxSharp;
    }

    public void dull() {
        if (sharpness <= 0) {
            System.out.println("Your weapon is too dull!");
            return;
        }
        sharpness = sharpness - ((double)dmg)/10;
    }
}