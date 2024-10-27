public class Main {
    public static void main(String[] args) {
        Sword shortSword = new Sword(4);
        Sword sword = new Sword(18);

        System.out.println(shortSword);
        System.out.println(sword);

        System.out.println(sword.equals(shortSword));
        System.out.println(sword.equals(sword));
    }
}