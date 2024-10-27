public class Machinist {
    private double balance;

    public Machinist(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public Part makePart(Stock stock, double manufacturingCost, double amountCut) {
        balance -= manufacturingCost;
        return new Part(stock, manufacturingCost, amountCut);
    }

    public Stock purchaseStock(String material, double cost, double volume) {
        balance -= cost;
        return new Stock(material, cost, volume);
    }

    public void sellPart(Part part) {
        balance += part.getCost();
    }
}