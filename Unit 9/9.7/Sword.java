public class Sword {
    private double length;
    public Sword() {}

    public Sword(double length) {
        this.length = length;
    }

    public String toString() {
        return "Sword of length " + length;
    }

    public boolean equals(Object other) {
        return (length == ((Sword)other).length);
    }
}
