public class Bean {
    private String color;
    private String size;
    private boolean cooked;

    public Bean(String color, String size, boolean cooked) {
        this.color = color;
        this.size = size;
        this.cooked = cooked;
    }

    public void cook() {
        cooked = true;
    }

    public String toString() {
        return color + " " + size + " beans (cooked: " + cooked + ")";
    }
}
