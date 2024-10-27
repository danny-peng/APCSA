public class Test {
    public static void main(String[] args) {
        int[] arr = new int[]{0};
        modifyArray(arr);
        System.out.println(arr[0]);
    }

    public static void modifyArray(int[] array) {
        array[0] = 1;
    }
}
