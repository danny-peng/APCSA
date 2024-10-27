public class Main {
    public static void main(String[] args) {
    Machinist john = new Machinist(100);
    Stock aluminum = john.purchaseStock("Aluminum", 40, 40);
    Part gear = john.makePart(aluminum, 10, 10);

    Stock aluminumTwo = john.purchaseStock("Aluminum", 20, 20);
    Part smallerGear = john.makePart(aluminumTwo, 5, 5);

    System.out.println("Gear:\n" + gear + "\n");
    System.out.println("Smaller Gear:\n" + smallerGear + "\n");
    System.out.println("Gear costs " + gear.getCostDifference(smallerGear) + " more");
    }
}
