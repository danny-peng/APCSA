public class Main {
  public static void main(String[] args) {
    int balance = 1000;
    double price = 24.99;
    int numPurchases = 4;
    
    double remaining = balance - (price * numPurchases);
    
    int people = 0;
    
    System.out.println("Your balance is " + balance);
    System.out.println("The price of your item is " + price);
    System.out.println("You are buying it " + numPurchases + " times");
    
    System.out.println("Your remaining balance is " + remaining);
    try {
      System.out.println("You spread the purchased objects across " + people + " people");
      System.out.println("Each person gets " + numPurchases/people + " of your items");
    }
    catch (ArithmeticException e) {
      System.out.println("You have no friends to give share your items:(");
    }
  }
}