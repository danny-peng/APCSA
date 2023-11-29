public class Main {
    public static void main(String[] args) {
        double MP = 100;
        
        Spell fireball = new Spell ("Fire", "Fireball");

        System.out.println("You gained a " + fireball.getElement() + " spell named " + fireball.getName());
        System.out.println("Damage: " + fireball.getDmg() + "\nSpeed: " + fireball.getSpeed() + "\nSize: " + fireball.getSize());
        System.out.println("Mana Cost: " + fireball.getManaCost() + " MP");

        System.out.println("\nYou use " + fireball.getName());
        MP = MP - fireball.getManaCost();
        System.out.println("You now have " + MP + " MP left!");
    }
}