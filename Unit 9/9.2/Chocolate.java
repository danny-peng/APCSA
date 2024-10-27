public class Chocolate extends Food {
    public Chocolate() {
        System.out.println("Made default chocolate food item");
    }

    public Chocolate(double price, int calories) {
        super(price, calories, false);
        System.out.println("Custom chocolate made");
    }
}
