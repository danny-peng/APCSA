public class Part {
    private String material;
    private double cost;
    private double volume;

    public Part(Stock stock, double manufacturingCost, double amountCut) {
        material = stock.getMaterial();
        cost = stock.getCost() + manufacturingCost;
        volume = stock.getVolume() - amountCut;
    }

    public double getCostDifference(Part other) {
        return cost - other.cost;
    }

    public double getCost() {
        return cost;
    }

    public String toString() {
        return "Material: " + material + "\n" +
               "Cost: " + cost + "\n" +
               "Volume: " + volume;
    }

    public void increaseCost(double amount) {
        cost += amount;
    }
}
