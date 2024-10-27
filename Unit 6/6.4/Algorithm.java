public class Algorithm {
    public static void printElements(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /**
     * Swaps the elements at firstIndex and secondIndex in array. Does not use a copy of array, will modifies array.
     * @param array array to be modified
     * @param firstIndex first index to swap 
     * @param secondIndex second index to swap
     */
    public static void swapElements(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    public static int getMaximum(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) max = num;
        }

        return max;
    }

    public static int getMinimum(int[] array) {
        int min = array[0];
        for (int num : array) {
            if (num < min) min = num;
        }

        return min;
    }

    public static String getShortestString(String[] strings) {
        if (strings.length == 0) return "";

        String shortest = strings[0];

        for (String str : strings) {
            if (str.length() < shortest.length()) shortest = str;
        }

        return shortest;
    }

    public static String getLongestString(String[] strings) {
        if (strings.length == 0) return "";

        String longest = strings[0];

        for (String str : strings) {
            if (str.length() > longest.length()) longest = str;
        }

        return longest;
    }

    public static int getLargestDifference(int[] arrayOne, int[] arrayTwo) {
        int largest = 0;

        int len = (arrayTwo.length > arrayOne.length) ? arrayOne.length : arrayTwo.length;

        for (int i = 0; i < len; i++) {
            if (Math.abs(arrayOne[i] - arrayTwo[i]) > largest) largest = Math.abs(arrayOne[i] - arrayTwo[i]);
        }

        return largest;
    }

    public static double getAverage(double[] array) {
        double sum = 0;

        for (double num : array) {
            sum += num;
        }

        return sum / array.length;
    }

    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
    }

    public static boolean containsConsecutiveDuplicate(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == array[i+1]) return true;
        }
        return false;
    }

    public static int getIndexOfNegative(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) return i;
        }
        return -1;
    }

    public static boolean containsDuplicate(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j=i+1; j < array.length; j++) {
                if (array[i] == array[j]) return true;
            }
        }
        return false;
    }

    public static int getLongestStreak(int[] nums, int num) {
        int longestStreak = 0;
        int streak = 0;
        for (int n : nums) {
            if (n == num) streak++;
            else {
                if (streak > longestStreak) longestStreak = streak;
                streak = 0;
            }
        }
        
        if (streak > longestStreak) longestStreak = streak;

        return longestStreak;
    }

    public static String getLastAlphabetical(String[] strings) {
        if (strings.length == 0) return ""; // return empty if empty array
        String last = strings[0];

        for (int i = 1; i < strings.length; i++) { // iterate through strings
            // get shorter string
            String shorter = (strings[i].length() < last.length()) ? strings[i] : last;
            String longer = (strings[i].length() > last.length()) ? strings[i] : last;

            for (int letterIndex=0; letterIndex < shorter.length(); letterIndex++) {// iterate through letters and compare
                int difference = shorter.substring(letterIndex, letterIndex+1).compareTo(longer.substring(letterIndex, letterIndex+1));
                
                // set later string as last
                if (difference > 0) {
                    last = shorter;
                    break; // continue to next string
                } else if (difference < 0) {
                    last = longer;
                    break;
                }
            }
            // same letters
            last = shorter;
        }

        return last;
    }

    public static boolean containsIdenticalValue(int[] arrayOne, int[] arrayTwo) {
        for (int num : arrayOne) {
            for (int otherNum : arrayTwo) {
                if (num == otherNum) return true;
            }
        }

        return false;
    }
}
