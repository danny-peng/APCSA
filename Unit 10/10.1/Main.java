import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(recursiveFactorial(3));
        System.out.println(recursiveFactorial(4));
        System.out.println(recursiveFactorial(5));
        
        System.out.println();

        System.out.println(iterationFactorial(3));
        System.out.println(iterationFactorial(4));
        System.out.println(iterationFactorial(5));
        
        System.out.println();

        printString("Hello World!", 0);
        printString("Hello World!", 2);
        printString("Goodbye World!", 0);

        System.out.println();

        printArray(new int[]{0, 1, 2, 3}, 0);
        printArray(new int[]{0, 1, 2, 3}, 2);
        printArray(new int[]{0, 1}, 0);

        System.out.println();
        
        ArrayList<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(2);
        ints.add(3);

        printArrayList(ints, 0);
        printArrayList(ints, 1);

        ArrayList<Integer> moreInts = new ArrayList<Integer>();
        moreInts.add(4);
        moreInts.add(5);
        printArrayList(moreInts, 0);
    }

    public static int recursiveFactorial(int num) {
        if (num <= 1) return 1;
        return num * recursiveFactorial(num-1);
    }

    public static int iterationFactorial(int num) {
        int sum = 1;
        for (int i = num; i >= 1; i--) {
            sum *= i;
        }
        return sum;
    }

    public static void printString(String str, int i) {
        if (i >= str.length()) {
            System.out.println();
            return;
        }
        System.out.print(str.substring(i, i+1));
        printString(str, i+1);
    }

    public static void printArray(int[] arr, int i) {
        if (i >= arr.length) {
            System.out.println();
            return;
        }
        System.out.print(arr[i] + " ");
        printArray(arr, i+1);
    }
    
    public static void printArrayList(ArrayList<Integer> arr, int i) {
        if (i >= arr.size()) {
            System.out.println();
            return;
        }
        System.out.print(arr.get(i) + " ");
        printArrayList(arr, i+1);
    }
}