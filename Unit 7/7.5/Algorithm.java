import java.util.ArrayList;

public class Algorithm {
    public static int getNumNegative(ArrayList<Integer> arr) {
        int count = 0;
        for (int n : arr) if (n < 0) count++;
        return count;
    }

    public static boolean containsString(ArrayList<String> arr, String str) {
        for (String s : arr) if (s.equals(str)) return true;
        return false;
    }

    public static boolean containsOverlap(ArrayList<Integer> a, ArrayList<Integer> b) {
        for (int n : a) for (int m : b) if (n == m) return true;
        return false;
    }

    public static int ArrayListIndexOfInt(ArrayList<Integer> arr, int n) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == n) return i;
        }
        return -1;
    }

    public static int ArrayIndexOfInt(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) return i;
        }
        return -1;
    }
}
