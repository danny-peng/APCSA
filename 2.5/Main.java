public class Main {
    public static void main(String[] args) {
        Spell fireball = new Spell ("Fire", "Fireball");

        System.out.println("You gained a " + fireball.getElement() + " spell named " + fireball.getName());
        System.out.println("Damage: " + fireball.getDmg() + "\nSpeed: " + fireball.getSpeed() + "\nSize: " + fireball.getSize());
        System.out.println("Mana Cost: " + fireball.getManaCost() + " MP");
    }
}