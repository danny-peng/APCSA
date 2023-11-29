public class Main {
  public static void main(String[] args) {
    for (int i = 0; i < 1000; i++) {
      int num = randomInt(0, 100);
      System.out.println(num);
      if (num == 100) {
        break;
      }
    }
  }
  
  public static int randomInt(int min, int max) {
    return (int)(Math.random() * (max - min + 1) + min);
  }
}