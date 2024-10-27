public class Drink {
    private boolean healthy;

    public Drink() {}

    public Drink(boolean healthy) {
        this.healthy = healthy;
    }

    public String toString() {
        if (healthy) return "A healthy drink";
        return "An unhealthy drink";
    }

    public boolean equals(Drink other) {
        return other.healthy == this.healthy;
    }
}
