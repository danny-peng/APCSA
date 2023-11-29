public class Main {
    public static void main(String[] args) {
        Weapon sword = new Weapon(5, 20);
        Weapon axe = new Weapon(10, 10, 1, 3);

        System.out.println("Sword: ");
        sword.printStats();
        System.out.println("\nAxe: ");
        axe.printStats();

        System.out.println("\nSword: ");
        sword.upgrade();
        System.out.println("\nSword Stats: ");
        sword.printStats();

        System.out.println("\nAxe used!");
        axe.dull();
        System.out.println("\nAxe Stats: ");
        axe.printStats();
        System.out.println("\nSharpening axe...");
        axe.sharpen();
        System.out.println("\nAxe Stats: ");
        axe.printStats();
    }
}