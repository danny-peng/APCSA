public class Main {
    public static void main(String[] args) {
        int playerAtk = 10;
        double playerHp = 100.0;
        int playerDef = 25;
        
        Enemy zombie = new Enemy();

        System.out.println("An enemy appears with:");
        System.out.println(zombie.getHp() + " HP");
        System.out.println(zombie.getDef() + " Def");
        System.out.println(zombie.getAtk() + " Atk");
        System.out.println();

        playerHp -= zombie.attack() * (1 - (double) playerDef / 100.0);
        System.out.println("You are left with " + playerHp + " HP\n");

        System.out.println("You attack back.");
        zombie.defend(playerAtk);
        System.out.println("It now has " + zombie.getHp() + " HP");
    }
}
