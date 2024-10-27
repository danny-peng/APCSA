public class Food {
    private double price;
    private int calories;
    private boolean healthy;

    public Food() {
        System.out.println("Default food item created");
    }

    public Food(double price, int calories, boolean healthy) {
        this.price = price;
        this.calories = calories;
        this.healthy = healthy;
        System.out.println("Custom food item created");
    }

    public int getCalories() {
        return calories;
    }
}
