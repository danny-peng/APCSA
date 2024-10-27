public class Main {
    public static void main(String[] args) {
        int[][] ints = {{0, 1},
                        {2, 3}};
        for (int r = 0; r < ints.length; r++) {
            System.out.print("| ");
            for (int c = 0; c < ints[0].length; c++) {
                int old = ints[r][c];
                ints[r][c]++;
                System.out.print("O: " + old + " N: " + ints[r][c] + " | ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Column-Major Order: ");
        for (int c = 0; c < ints[0].length; c++) {
            for (int[] row : ints) {
                System.out.print(row[c] + " ");
            }
            System.out.println();
        }
        System.out.println();


        double[][] doubles = {{0.0, 1.0},
                              {2.0, 3.0}};
        for (int r = 0; r < doubles.length; r++) {
            System.out.print("| ");
            for (int c = 0; c < doubles[0].length; c++) {
                double old = doubles[r][c];
                doubles[r][c] = old + 1.5;
                System.out.print("O: " + old + " N: " + doubles[r][c] + " | ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Column-Major Order: ");
        for (int c = 0; c < doubles[0].length; c++) {
            for (double[] row : doubles) {
                System.out.print(row[c] + " ");
            }
            System.out.println();
        }
        System.out.println();

        boolean[][] bools = {{false, true},
                             {false, true}};
        for (int r = 0; r < bools.length; r++) {
            System.out.print("| ");
            for (int c = 0; c < bools[0].length; c++) {
                boolean old = bools[r][c];
                bools[r][c] = !old;
                System.out.print("O: " + old + " N: " + bools[r][c] + " | ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Column-Major Order: ");
        for (int c = 0; c < bools[0].length; c++) {
            for (boolean[] row : bools) {
                System.out.print(row[c] + " ");
            }
            System.out.println();
        }
        System.out.println();

        String[][] strings = {{"a", "b"},
                              {"c", "d"}};
        for (int r = 0; r < strings.length; r++) {
            System.out.print("| ");
            for (int c = 0; c < strings[0].length; c++) {
                String old = strings[r][c];
                strings[r][c] = old + " but modified";
                System.out.print("O: " + old + " N: " + strings[r][c] + " | ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Column-Major Order: ");
        for (int c = 0; c < strings[0].length; c++) {
            for (String[] row : strings) {
                System.out.print(row[c] + " ");
            }
            System.out.println();
        }
        System.out.println();

        Shoe[][] shoes = {{new Shoe(1), new Shoe(2)},
                          {new Shoe(3), new Shoe(4)}};
        for (int r = 0; r < shoes.length; r++) {
            System.out.print("| ");
            for (int c = 0; c < shoes[0].length; c++) {
                Shoe old = shoes[r][c];
                shoes[r][c] = new Shoe(old.getSize() + 1);
                System.out.print("O: " + old + " N: " + shoes[r][c] + " | ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Column-Major Order: ");
        for (int c = 0; c < shoes[0].length; c++) {
            for (Shoe[] row : shoes) {
                System.out.print(row[c] + " ");
            }
            System.out.println();
        }
    }
}
