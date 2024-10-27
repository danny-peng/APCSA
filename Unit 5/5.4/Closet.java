public class Closet {
  private ArticleOfClothing shirt;
  
  public Closet(ArticleOfClothing s) {
    shirt = new ArticleOfClothing(s.getColor(), s.getSize());
  }
  
  public ArticleOfClothing getClothing() {
    return shirt;
  }
  
  public String toString() {
    return "Closet with a(n) " + getClothing();
  }
}