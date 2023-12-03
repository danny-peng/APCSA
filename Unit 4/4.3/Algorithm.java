public class Algorithm {
    /* Assignment 4.1 */
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

    /* Assignment 4.3 */
    public static boolean strContains(String original, String sub) {
        for (int i = 0; i <= original.length() - sub.length(); i++) {
            if (original.substring(i, i+sub.length()).equals(sub)) {
                return true;
            }
        }
        
        return false;
    }

    public static String reverseStr(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.substring(str.length()-i-1, str.length() - i);
        }

        return result;
    }

    public static boolean isPalindrome(String str) {
        return str.equals(reverseStr(str));
    }

    public static int numOccurences(String original, String sub) {
        int count = 0;
        for (int i = 0; i <= original.length() - sub.length(); i++) {
            if (original.substring(i, i+sub.length()).equals(sub)) {
                count++;
            }
        }

        return count;
    }
}
