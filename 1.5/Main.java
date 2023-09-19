import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Enter a number with a decimal: ");
    double num = s.nextDouble();
    int numInt = (int)num;

    s.close();
    
    System.out.println("The biggest integer I know is " + Integer.MAX_VALUE);
    System.out.println("If turn " + num + " into an integer (" + numInt + "), and add it to that, we get: "); 
    System.out.println(Integer.MAX_VALUE + numInt);
  }
}
