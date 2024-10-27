public class Main {
    public static void main(String[] args) {
        Chocolate choco = new Chocolate(6.99, 200);
        System.out.println(choco.getCalories());
        
        Chocolate blankChoco = new Chocolate();  
        System.out.println(blankChoco.getCalories());
    }
}
