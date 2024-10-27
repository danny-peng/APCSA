import java.util.ArrayList;

public class Algorithm {
    // More or less modified your Sort.java. Hope you don't mind.

    /**
     * Prints an array.
     *
     * @param arr the array to be printed
     */
    public static void print(String[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length - 1; i++)
            str += arr[i] + ", ";
        str += arr[arr.length - 1] + "]";
        System.out.println(str);
    }

    /**
     * Returns the index of the minimum value in an String array
     * beginning at a specified index
     *
     * @param index the starting index to search
     * @param arr   the array to search
     * @return the index of the minimum value
     */
    public static int findMinIndex(int index, String[] arr) {
        // int minUpdate = 0;
        String min = arr[index];
        for (int i = index; i < arr.length; i++) {
            if (arr[i].compareTo(min) < 0) {
                min = arr[i];
                index = i;
                // minUpdate++;
            }
        }
        // System.out.println("Minimum Updates: " + minUpdate);
        return index;
    }
    public static int findMinIndexArrListStr(int index, ArrayList<String> arr) {
        // int minUpdate = 0;
        String min = arr.get(index);
        for (int i = index; i < arr.size(); i++) {
            if (arr.get(i).compareTo(min) < 0) {
                min = arr.get(i);
                index = i;
                // minUpdate++;
            }
        }
        // System.out.println("Minimum Updates: " + minUpdate);
        return index;
    }
    public static int findMinIndex(int index, ArrayList<Integer> arr) {
        // int minUpdate = 0;
        int min = arr.get(index);
        for (int i = index; i < arr.size(); i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
                index = i;
                // minUpdate++;
            }
        }
        // System.out.println("Minimum Updates: " + minUpdate);
        return index;
    }

    public static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void swapArrListStr(ArrayList<String> arr, int i, int j) {
        arr.set(j, arr.set(i, arr.get(j)));
    }
    public static void swap(ArrayList<Integer> arr, int i, int j) {
        arr.set(j, arr.set(i, arr.get(j)));
    }

    /**
     * Sorts an int array in ascending order with selection sort
     * 
     * @param arr the int array to be sorted
     */
    public static void selectionSort(String[] arr) {
        // int swaps = 0;
        for (int i = 0; i < arr.length; i++) {
            int minIndex = findMinIndex(i, arr);
            if (minIndex != i) {
                swap(arr, i, minIndex);
                // swaps++;
            }
            // print(arr);
        }
        // System.out.println("Swaps: " + swaps);
    }
    public static void selectionSortArrListStr(ArrayList<String> arr) {
        // int swaps = 0;
        for (int i = 0; i < arr.size(); i++) {
            int minIndex = findMinIndexArrListStr(i, arr);
            if (minIndex != i) {
                swapArrListStr(arr, i, minIndex);
                // swaps++;
            }
            // print(arr);
        }
        // System.out.println("Swaps: " + swaps);
    }
    public static void selectionSort(ArrayList<Integer> arr) {
        // int swaps = 0;
        for (int i = 0; i < arr.size(); i++) {
            int minIndex = findMinIndex(i, arr);
            if (minIndex != i) {
                swap(arr, i, minIndex);
                // swaps++;
            }
            // print(arr);
        }
        // System.out.println("Swaps: " + swaps);
    }

    public static void insertionSort(String[] arr) {
        // int swaps = 0;
        for (int i = 1; i < arr.length; i++) {
            String temp = arr[i];
            int index = i;
            while (index > 0 && temp.compareTo(arr[index - 1]) < 0) { // 
                swap(arr, index, index - 1);
                // swaps++;
                index--;
            }
            // print(arr);
        }
        // System.out.println("Swaps: " + swaps);
    }
    public static void insertionSortArrListStr(ArrayList<String> arr) {
        // int swaps = 0;
        for (int i = 1; i < arr.size(); i++) {
            String temp = arr.get(i);
            int index = i;
            while (index > 0 && temp.compareTo(arr.get(index - 1)) < 0) { // 
                swapArrListStr(arr, index, index - 1);
                // swaps++;
                index--;
            }
            // print(arr);
        }
        // System.out.println("Swaps: " + swaps);
    }
    public static void insertionSort(ArrayList<Integer> arr) {
        // int swaps = 0;
        for (int i = 1; i < arr.size(); i++) {
            int temp = arr.get(i);
            int index = i;
            while (index > 0 && temp < arr.get(index - 1)) { // 
                swap(arr, index, index - 1);
                // swaps++;
                index--;
            }
            // print(arr);
        }
        // System.out.println("Swaps: " + swaps);
    }
}
