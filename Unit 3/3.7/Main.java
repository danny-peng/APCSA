public class Main {
    public static void main(String[] args) {
        Board gameOne = new Board();
        Board gameTwo = new Board();

        System.out.println(gameOne == gameTwo);
        System.out.println(gameOne.equals(gameTwo));
    }
}