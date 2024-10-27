public class GamePiece {
  private int x = 0; // private instance variables
  private int y = 0;
  
  public GamePiece(int x, int y) { // public constructor
    this.x = x;
    this.y = y;
  }
  
  public void moveTo(int newX, int newY) { // public method
    if (canMoveTo(newX, newY)) {
      x = newX;
      y = newY;
    }
  }
  
  private boolean canMoveTo(int newX, int newY) { // private method
    return newX != x || newY != y;
  }
  
  public int getX() { // accessor
    return x;
  }
  
  public int getY() {
    return y;
  }
  
  public void moveUp() { // mutator
    y++;
  }
}