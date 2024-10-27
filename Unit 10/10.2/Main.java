public class Main {
    public static void main(String[] args) {
        int[] array = getRandomArray(10, 0, 9);
        printArray(array);

        int target = random(0, 9);
        System.out.println("Target: " + target);
        System.out.println("Result: " + binarySearch(array, 0, array.length-1, target) + " (recursive) " 
                            + iterativeBinarySearch(array, target) + " (iterative)");

        System.out.println("Sorting...");
        mergeSort(array, 0, array.length-1);
        printArray(array);
        System.out.println("New result: " + binarySearch(array, 0, array.length-1, target) + " (recursive) " 
                            + iterativeBinarySearch(array, target) + " (iterative)");
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        if (array.length != 0) System.out.print(array[array.length-1]);
        System.out.print("] \n");
    }

    public static int[] getRandomArray(int length, int min, int max) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random(min, max);
        }

        return array;
    }

    public static int random(int min, int max) {
        return (min + ((int) (Math.random()*max)) + 1);
    }

    public static int binarySearch(int[] array, int low, int high, int target) {
        if (low > high) return -1;
        
        int middle = (low + high) / 2;
        if (array[middle] == target) return middle;
        
        if (array[middle] > target) {
            return binarySearch(array, low, middle - 1, target);
        } else if (array[middle] < target) {
            return binarySearch(array, middle + 1, high, target);
        }
        return -1;
    }

    public static int iterativeBinarySearch(int[] array, int target) {
        int low = 0, high = array.length-1;
        while (low <= high) {
            int middle = (low + high) / 2;
            
            if (array[middle] == target) return middle;
            
            if (array[middle] > target) high = middle - 1;
            
            else if (array[middle] < target) low = middle + 1;
        }
        return -1;
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            merge(array, left, right, middle);
        }
    }

    public static void merge(int[] array, int left, int right, int middle) {
        int[] leftArray = new int[middle - left + 1]; // left and right arrays
        int[] rightArray = new int[right - middle]; 
        // CollegeBoard uses one temp array and simply tracks the "subarrays" but this makes it easier to see a bit for me

        // copy values
        for (int i = 0; i < leftArray.length; i++) leftArray[i] = array[left + i];

        for (int i = 0; i < rightArray.length; i++) rightArray[i] = array[middle + 1 + i];
        
        // System.out.println("L: " + left + " R: " + right + " M: " + middle);
        // System.out.print("Merging: ");
        // printArray(leftArray);
        // printArray(rightArray);
        // System.out.println();

        int leftIndex = 0, rightIndex = 0; // tracker variables
        int index = left;
        while (leftIndex < leftArray.length && rightIndex < rightArray.length) { // compare and add until one array is fully used
            if (leftArray[leftIndex] < rightArray[rightIndex]) {
                array[index] = leftArray[leftIndex]; // replace element in array
                leftIndex++;
            } else {
                array[index] = rightArray[rightIndex]; // replace element in array
                rightIndex++;
            }
            index++;
        }

        // add the remaining values (one of these will not run)
        while (leftIndex < leftArray.length) {
            array[index] = leftArray[leftIndex];
            leftIndex++;
            index++;
        }
        while (rightIndex < rightArray.length) {
            array[index] = rightArray[rightIndex];
            rightIndex++;
            index++;
        }
    }
}