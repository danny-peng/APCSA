public class Main {
    public static void print(int[] arr) {
        for (int n : arr) System.out.print(n + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        String[][] strings = {{"Hello,", "world", "!"}, 
                              {"It's", "me", "Genevieve"}};
        System.out.println(Algorithm.getNumElementsContains(strings, "e"));
        System.out.println(Algorithm.getNumElementsContains(strings, "z"));   
        System.out.println(Algorithm.getNumElementsContains(strings, "d")); 
        System.out.println();
                                             
        int[][] ints = {{1, 2}, 
                        {3, 4}};
        System.out.println(Algorithm.containsInt(ints, 5));
        System.out.println(Algorithm.containsInt(ints, 3));
        System.out.println(Algorithm.containsInt(ints, 0));
        System.out.println();

        print(Algorithm.getFirstOccurenceIndices(ints, 3));
        print(Algorithm.getFirstOccurenceIndices(ints, 0));
        print(Algorithm.getFirstOccurenceIndices(ints, 1));
        System.out.println();

        print(Algorithm.getDiagonal(ints));
        int[][] ints2 = {{1, 2, 3},
                         {4, 5, 6}};
        print(Algorithm.getDiagonal(ints2));
        int[][] ints3 = {{1, 2},
                         {3, 4},
                         {5, 6}};
        print(Algorithm.getDiagonal(ints3));
        System.out.println();

        String[][] strings2 = {{"Hello,", "world", "!"}, 
                               {"It's", "me", "Margaret"}};
        System.out.println(Algorithm.concatColumn(strings2, 1));
        System.out.println(Algorithm.concatColumn(strings2, 0));
        System.out.println(Algorithm.concatColumn(strings2, 2));
        System.out.println();

        int[][] ints4 = {{3, 2, 1}, 
                         {4, 5, 6}};
        System.out.println(Algorithm.getMax(ints4));
        int[][] ints5 = {{3, 2}, 
                         {4, 5}};
        System.out.println(Algorithm.getMax(ints5));
        int[][] ints6 = {{0, 1}, 
                         {0, 0}};
        System.out.println(Algorithm.getMax(ints6));
        System.out.println();

        System.out.println(Algorithm.getMin(ints4));
        System.out.println(Algorithm.getMin(ints5));
        System.out.println(Algorithm.getMin(ints6));
        System.out.println();

        System.out.println(Algorithm.getShortestString(strings2));
        String[][] strings3 = {{"Hello,", "world"}, 
                               {"It's", "me"}};
        System.out.println(Algorithm.getShortestString(strings3));
        String[][] strings4 = {{"Hello,", ""}, 
                               {"It's", "me"}};
        System.out.println(Algorithm.getShortestString(strings4));
        System.out.println();

        System.out.println(Algorithm.getLongestString(strings2));
        System.out.println(Algorithm.getLongestString(strings3));
        System.out.println(Algorithm.getLongestString(strings4));
        System.out.println();

        int[][] ints7 = {{2, 3, 4}, {-1, -2, -3}};
        int[][] ints8 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Algorithm.getLargestCorrespondingAbsValue(ints7, ints8));
        int[][] ints9 = {{2, 3, 4}, {-1, -2, -1}};
        int[][] ints10 = {{1, 2, 3}, {4, 5, 2}};
        System.out.println(Algorithm.getLargestCorrespondingAbsValue(ints9, ints10));
        int[][] ints11 = {{2, 3}, {-1, -3}};
        int[][] ints12 = {{1, 2}, {4, 2}};
        System.out.println(Algorithm.getLargestCorrespondingAbsValue(ints11, ints12));
        System.out.println();

        double[][] doubles = {{1.6, 3.2, 5.4}, {6.3, 4.1, 2.5}};
        System.out.println(Algorithm.getMean(doubles));
        double[][] doubles2 = {{10.0, 10.0, 10.0}, {10.0, 10.0, 5.0}};
        System.out.println(Algorithm.getMean(doubles2));
        double[][] doubles3 = {{10.0, 0.0}, {10.0, 20.0}};
        System.out.println(Algorithm.getMean(doubles3));
        System.out.println();

        int[][] ints13 = {{1, 2}, {3, 2}};
        System.out.println(Algorithm.containsDuplicate(ints13));
        System.out.println(Algorithm.containsDuplicate(ints7));
        System.out.println(Algorithm.containsDuplicate(ints9));
        System.out.println();

        String[][] strings5 = {{"bravo", "charlie"}, {"zebra", "alpha"}};
        System.out.println(Algorithm.getLastStringAlphabetical(strings5));
        String[][] strings6 = {{"charlie"}, {"alpha"}};
        System.out.println(Algorithm.getLastStringAlphabetical(strings6));
        System.out.println(Algorithm.getLastStringAlphabetical(strings3));
    }
}
