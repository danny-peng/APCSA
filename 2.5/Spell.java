public class Spell {
    private String element;
    private String name;

    private double dmg = 10;
    private double size = 1;
    private int speed = 5;
    private double manaCost = dmg * size * (int)(speed/5 + 1);

    public Spell(String element, String name) {
        this.element = element;
        this.name = name;
    }

    public Spell(String element, String name, double dmg, double size, int speed) {
        this.element = element;
        this.name = name;
        this.dmg = dmg;
        this.size = size;
        this.speed = speed;
        this.manaCost = dmg * size * (int)(speed/5 + 1);
    }

    public String getElement() {
        return element;
    }
    public String getName() {
        return name;
    }
    public double getDmg() {
        return dmg;
    }
    public double getSize() {
        return size;
    }
    public int getSpeed() {
        return speed;
    }
    public double getManaCost() {
        return manaCost;
    }
}
