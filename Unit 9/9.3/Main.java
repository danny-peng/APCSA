public class Main {
    public static void main(String[] args) {
        Utensil utensil = new Utensil("Metal");
        Knife knife = new Knife("Plastic");
        utensil.use();
        knife.use();
    }
}
