public class Main {
    public static void main(String[] args) {
        Toy smurf = new Toy();

        HappyMeal mealOne = new HappyMeal(smurf);
        HappyMeal mealTwo = new HappyMeal(smurf);

        System.out.println("mealOne: " + mealOne.hasSqueakyToy());
        System.out.println("mealTwo: " + mealTwo.hasSqueakyToy());
        mealOne.setToySqueaky(true);
        System.out.println();
        System.out.println("mealOne: " + mealOne.hasSqueakyToy());
        System.out.println("mealTwo: " + mealTwo.hasSqueakyToy());
    }
}
