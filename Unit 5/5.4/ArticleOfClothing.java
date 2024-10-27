public class ArticleOfClothing {
  private String color;
  private String size;
  
  public ArticleOfClothing(String c, String s) {
    color = c;
    size = s;
  }
  
  public String toString() {
    return color + " size " + size + " shirt"; 
  }
  
  public String getColor() {
    return color;
  }
  
  public String getSize() {
    return size;
  }
  
  public void setSize(String newSize) {
    size = newSize;
  }
  
  public void setColor(String newColor) {
    color = newColor; 
  }
}