public class Stock {
    private String material;
    private double cost;
    private double volume;

    public Stock(String material, double cost, double volume) {
        this.material = material;
        this.cost = cost;
        this.volume = volume;
    }

    public String getMaterial() {
        return material;
    }

    public double getCost() {
        return cost;
    }

    public double getVolume() {
        return volume;
    }

    public void increaseCost(double amount) {
        cost += amount;
    }
}
