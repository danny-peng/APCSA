public class Knife extends Utensil {
    public Knife(String material) {
        super(material);
    }

    public void use() {
        System.out.println("Item sliced!");
    }
}
