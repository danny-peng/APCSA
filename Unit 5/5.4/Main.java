public class Main {
  public static void main(String[] args) {
    ArticleOfClothing shirt = new ArticleOfClothing("white", "m");
    Closet roomCloset = new Closet(shirt);
    
    System.out.println(roomCloset.getClothing());
  }
}