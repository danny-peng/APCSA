public class Main {
    public static void main(String[] args) {
        boolean canMove = false;
        
        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) { // placeholder until we learn arrays
                canMove = true;
                System.out.println("Can move to spot " + i);
            }
        }

        System.out.println("Can move? " + canMove);
    }
}
