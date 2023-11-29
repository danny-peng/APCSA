public class Algorithm {
    public static int getNumDigits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static boolean divisible(int first, int second) {
        int result = first;
        while (result >= second) {
            result -= second;
        }

        return result == 0;
    }

    public static int getOddSum(int first, int second) {
        int sum = 0;
       
        int current = first + (1 - first % 2); // first odd
        
        while (current <= second) {
            sum += current;
            current += 2;
        }

        return sum;
    }

    public static int getTenSum(int first, int second) {
        int sum = 0;
        int current = (int) Math.ceil(first/10.0) * 10;
        while (current <= second) {
            sum += current;
            current += 10;
        }

        return sum;
    }

    public static int getDigitSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num  % 10;
            num /= 10;
        }

        return sum;
    }

    public static int getPowerOfTwo(int num) {
        int exp = 0;
        while (Math.pow(2, exp) <= num) {
            exp++;
        }
        return (int) Math.pow(2, exp-1);
    }
}
