public class Main {
  public static void main(String[] args) {
    int hp = 100;
    final int maxHp = 100;
    int potAmount = 10;
    int spd = 40;
    
    System.out.println("You drank an HP potion! You gain " + potAmount + " HP!");
    hp += potAmount;
    
    if (hp > maxHp) {
      System.out.println("You have too much health! (" + hp + "/" + maxHp + ") Your speed decreases.");
      spd -= 10;
      System.out.println("You now have " + spd + " spd");
    }
  }
}