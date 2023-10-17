public class Main {
  public static void main(String[] args) {
    QuestItem orb = new QuestItem("Shadow Orb");
    
    System.out.println("You gained a(n) " + orb);
    System.out.println("Item name: " + orb.getName());
    System.out.println("It takes up " + orb.getName().length() + " spaces");
  }
}