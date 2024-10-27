public class Algorithm {
    public static int getNumElementsContains(String[][] arr, String str) {
        int count = 0;
        for (String[] row : arr) 
            for (String s : row) 
                if (s.indexOf(str) > -1)
                        count++;

        return count;
    }

    public static boolean containsInt(int[][] arr, int n) {
        for (int[] row : arr)
            for (int num : row)
                if (num == n) return true;
        
        return false;
    }

    public static int[] getFirstOccurenceIndices(int[][] arr, int n) {
        for (int row = 0; row < arr.length; row++)
            for (int col = 0; col < arr[row].length; col++)
                if (arr[row][col] == n) return new int[]{row, col};
                
        return new int[]{-1, -1};
    }

    public static int[] getDiagonal(int[][] arr) {
        int row = 0;
        int col = 0;
        int length = 0;
        // getting length of diagonal (doesn't have to be square arr)
        while (row < arr.length && col < arr[row].length) {
            length++;
            row++;
            col++;
        }

        int[] result = new int[length];
        for (int i = 0; i < length; i++) result[i] = arr[i][i];
        return result; 
    }

    public static String concatColumn(String[][] arr, int column) {
        String result = "";
        for (String[] row : arr)
            if (row.length-1 >= column) // does not have to be a rectangular arr
                result += row[column] + " ";

        return result;
    }

    public static int getMax(int[][] arr) {
        int max = arr[0][0];
        for (int[] row : arr) 
            for (int num : row) 
                if (num > max) max = num;

        return max;
    }
    
    public static int getMin(int[][] arr) {
        int min = arr[0][0];
        for (int[] row : arr) 
            for (int num : row) 
                if (num < min) min = num;

        return min;
    }

    public static String getShortestString(String[][] arr) {
        String min = arr[0][0];
        for (String[] row : arr) 
            for (String str : row) 
                if (str.length() < min.length()) min = str;

        return min;
    }

    public static String getLongestString(String[][] arr) {
        String max = arr[0][0];
        for (String[] row : arr) 
            for (String str : row) 
                if (str.length() > max.length()) max = str;

        return max;
    }

    public static int getLargestCorrespondingAbsValue(int[][] a, int[][] b) {
        int largest = 0;
        for (int r = 0; r < a.length; r++)
            for (int c = 0; c < a[r].length; c++)
                if (Math.abs(a[r][c] - b[r][c]) > largest) largest = Math.abs(a[r][c] - b[r][c]);

        return largest;
    }

    public static double getMean(double[][] arr) {
        double sum = 0;
        int count = 0;
        for (double[] row : arr) 
            for (double n : row) {
                sum += n;
                count++;
            }

        return sum / count;
    }

    public static boolean containsDuplicate(int[][] arr) {
        // iterating through each element
        for (int r = 0; r < arr.length; r++) 
            for (int c = 0; c < arr[r].length; c++)
                // looking ahead for duplicate element
                for (int rr = r; rr < arr.length; rr++) {
                    int start = (rr == r) ? c + 1 : 0;
                    for (int cc = start; cc < arr[rr].length; cc++)
                        if (arr[r][c] == arr[rr][cc]) return true;
                }

        return false; 
    }

    public static String getLastStringAlphabetical(String[][] arr) {
        String last = arr[0][0];
        for (String[] row : arr) 
            for (String str : row) 
                if (str.compareTo(last) > 0) last = str;

        return last;
    }
}
