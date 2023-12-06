public class Main {
    public static void main(String[] args) {
        for (int row = 0; row < 8; row++) {
            System.out.print(" | ");
            for (int col = 0; col < 8; col++) {
                System.out.print(row + ", " + col + " | ");
            }
            
            System.out.println();
        }
    }
}
