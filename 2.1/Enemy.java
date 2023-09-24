public class Enemy {
    private double hp = 50.00;
    private int atk = 5;
    private int def = 25;

    public int attack() {
        System.out.println("Enemy attacks you!");
        return atk;
    }

    public void defend(int rawDmg) {
        System.out.println("Enemy is attacked!");
        hp -= rawDmg * (1 - def / 100.00);
        System.out.println("Remaining hp: " + hp);
    }

    public double getHp() {
        return hp;
    }
    public int getDef() {
        return def;
    }
    public int getAtk() {
        return atk;
    }
}
