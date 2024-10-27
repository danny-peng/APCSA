import java.util.ArrayList;

public class Algorithm {
    public static void removeConsecElem(ArrayList<Integer> arrayList) {
        for (int i = arrayList.size()-2; i >= 0; i--) {
            if (arrayList.get(i) == arrayList.get(i + 1)) {
                arrayList.remove(i+1);
            }
        }
    }

    public static void removeElem(ArrayList<Integer> arrayList, int n) {
        for (int i = arrayList.size()-1; i >= 0; i--) {
            if (arrayList.get(i) == n) {
                arrayList.remove(i);
            }
        }
    }

    public static void addElemToSorted(ArrayList<Integer> arr, int n) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > n) {
                arr.add(i, n);
                return;
            }
        }

        arr.add(n);
    }

    public static boolean isReverse(ArrayList<Integer> a, ArrayList<Integer> b) {
        if (a.size() != b.size()) return false;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) != b.get(b.size()-1-i)) return false;
        }

        return true;
    }

    public static int getMax(ArrayList<Integer> arr) {
        int max = arr.get(0);

        for (int n : arr) if (n > max) max = n;
        
        return max;
    }

    public static int getMin(ArrayList<Integer> arr) {
        int min = arr.get(0);

        for (int n : arr) if (n < min) min = n;
        
        return min;
    }

    public static String getShortestString(ArrayList<String> arr) {
        String shortest = arr.get(0);

        for (String str : arr) if (str.length() < shortest.length()) shortest = str;

        return shortest;
    }

    public static String getLongestString(ArrayList<String> arr) {
        String longest = arr.get(0);

        for (String str : arr) if (str.length() > longest.length()) longest = str;

        return longest;
    }

    public static int getLargestDif(ArrayList<Integer> a, ArrayList<Integer> b) {
        if (b.size() < a.size()) {
            ArrayList<Integer> temp = a;
            a = b;
            b = temp;
        }
        
        int largest = Math.abs(a.get(0) - b.get(0));
        for (int i = 0; i < a.size(); i++) {
            int dif = Math.abs(a.get(i) - b.get(i));
            if (dif > largest) largest = dif;
        }

        return largest;
    }

    public static double getMean(ArrayList<Double> arr) {
        double sum = 0;

        for (double n : arr) sum += n;

        return sum / arr.size();
    }

    public static void reverseArrayList(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size()/2; i++) {
            arr.set(arr.size()-1-i, arr.set(i, arr.get(arr.size()-1-i)));
        }
    }

    public static boolean containsConsecutiveDuplicate(ArrayList<Integer> arr) {
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i-1) == arr.get(i)) return true;
        }

        return false;
    }

    public static int getIndexOfNegative(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < 0) return i;
        }

        return -1;
    }

    public static boolean containsDuplicate(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i+1; j < arr.size(); j++) {
                if (arr.get(i) == arr.get(j)) return true;
            }
        }
        return false;
    }
}
