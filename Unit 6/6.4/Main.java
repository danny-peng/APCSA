public class Main {
    public static void main(String[] args) {
        Algorithm.printElements(new int[]{1, 2, 3});
        Algorithm.printElements(new int[]{3, 2});
        Algorithm.printElements(new int[]{3, 3, 4});
        System.out.println();

        int[] toSwap = {1, 2, 3, 4};
        Algorithm.swapElements(toSwap, 1, 2);
        Algorithm.printElements(toSwap);
        int[] swapTwo = {0, 2, 1};
        Algorithm.swapElements(swapTwo, 1, 2);
        Algorithm.printElements(swapTwo);
        int[] swapThree = {1, 4, 3, 2, 5};
        Algorithm.swapElements(swapThree, 1, 3);
        Algorithm.printElements(swapThree);
        System.out.println();

        System.out.println(Algorithm.getMaximum(new int[]{3, 2, 1}));
        System.out.println(Algorithm.getMaximum(new int[]{-2, -1}));
        System.out.println(Algorithm.getMaximum(new int[]{50, -51, 2, 3}));
        System.out.println();

        System.out.println(Algorithm.getMinimum(new int[]{3, 2, 1}));
        System.out.println(Algorithm.getMinimum(new int[]{-2, -1}));
        System.out.println(Algorithm.getMinimum(new int[]{50, -51, 2, 3}));
        System.out.println();

        System.out.println(Algorithm.getShortestString(new String[]{"Hello,", "world", "!"}));
        System.out.println(Algorithm.getShortestString(new String[]{"ab", "abc"}));
        System.out.println(Algorithm.getShortestString(new String[]{"", "something", "nothing", "everything"}));
        System.out.println();

        System.out.println(Algorithm.getLongestString(new String[]{"Hello,", "world", "!"}));
        System.out.println(Algorithm.getLongestString(new String[]{"ab", "abcd", "abc"}));
        System.out.println(Algorithm.getLongestString(new String[]{"", "something", "nothing"}));
        System.out.println();

        System.out.println(Algorithm.getLargestDifference(new int[]{2, 3, 4}, new int[]{-1, -2, -3}));
        System.out.println(Algorithm.getLargestDifference(new int[]{0, 2}, new int[]{-1, -2, -3}));
        System.out.println(Algorithm.getLargestDifference(new int[]{2, 3, 4}, new int[]{-1, -2}));
        System.out.println();

        System.out.println(Algorithm.getAverage(new double[]{2.0, 3.0, 4.0, 5.0}));
        System.out.println(Algorithm.getAverage(new double[]{100, 0}));
        System.out.println(Algorithm.getAverage(new double[]{100, 95, 90}));
        System.out.println();

        int[] toReverse = {1, 2, 3};
        Algorithm.reverseArray(toReverse);
        Algorithm.printElements(toReverse);
        int[] reverseTwo = {3, 2, 1};
        Algorithm.reverseArray(reverseTwo);
        Algorithm.printElements(reverseTwo);
        int[] reverseThree = {5, 4, 3, 2, 1};
        Algorithm.reverseArray(reverseThree);
        Algorithm.printElements(reverseThree);
        System.out.println();

        System.out.println(Algorithm.containsConsecutiveDuplicate(new int[]{1, 2, 3, 3, 4}));
        System.out.println(Algorithm.containsConsecutiveDuplicate(new int[]{1, 2, 3, 4}));
        System.out.println(Algorithm.containsConsecutiveDuplicate(new int[]{1, 2, 2, 3, 4, 5}));
        System.out.println();

        System.out.println(Algorithm.getIndexOfNegative(new int[]{1, 0, -1}));
        System.out.println(Algorithm.getIndexOfNegative(new int[]{3, 3, 4}));
        System.out.println(Algorithm.getIndexOfNegative(new int[]{-3, -2, 1}));
        System.out.println();

        System.out.println(Algorithm.containsDuplicate(new int[]{1, 2, 3, 2}));
        System.out.println(Algorithm.containsDuplicate(new int[]{1, 1}));
        System.out.println(Algorithm.containsDuplicate(new int[]{1, 2, 3}));
        System.out.println();

        System.out.println(Algorithm.getLongestStreak(new int[]{1, 2, 1, 1, 1}, 1));
        System.out.println(Algorithm.getLongestStreak(new int[]{1, 2, 1, 1, 1}, 2));
        System.out.println(Algorithm.getLongestStreak(new int[]{1, 2, 1}, 3));
        System.out.println();

        System.out.println(Algorithm.getLastAlphabetical(new String[]{"zebra", "alpha"}));
        System.out.println(Algorithm.getLastAlphabetical(new String[]{"alpha", "alpha"}));
        System.out.println(Algorithm.getLastAlphabetical(new String[]{"alpha", "a"}));
        System.out.println();

        System.out.println(Algorithm.containsIdenticalValue(new int[]{1, 2}, new int[]{3, 4}));
        System.out.println(Algorithm.containsIdenticalValue(new int[]{1, 2}, new int[]{1, 4, 3}));
        System.out.println(Algorithm.containsIdenticalValue(new int[]{1, 2, 3}, new int[]{3, 4, 3}));
    }
}
