public class Main {
    public static void main(String[] args) {
        int turn = 1;
        boolean canMove = true;
        boolean inCheck = false;

        int turnsSinceCap = 0;

        if (turn % 2 == 1) {
            if (canMove) {
                System.out.println("Your move!");
            }
            if (inCheck && !canMove) {
                System.out.println("Checkmate! You lose!");
            }
            if (turnsSinceCap >= 50 || (!canMove && !inCheck)) {
                System.out.println("Stalemate!");
            }
        }
    }
}
