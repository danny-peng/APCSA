public class HappyMeal {
    private Toy toy;

    public HappyMeal(Toy t) {
        toy = new Toy();
    }

    public boolean hasSqueakyToy() {
        return toy.isSqueaky();
    }

    public void setToySqueaky(boolean toySqueaky) {
        toy.setSqueaky(toySqueaky);
    }
}
