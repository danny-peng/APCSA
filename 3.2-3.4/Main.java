public class Main {
  public static void main(String[] args) {
    boolean inCheck = false;
    boolean canMove = true;
    
    if (inCheck) {
      System.out.println("Check!");
      // insert check handling code
    } else if (canMove) {
      System.out.println("Your turn!");
    } else {
      System.out.println("Stalemate!");
    }
  }
}