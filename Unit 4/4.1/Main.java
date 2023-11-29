public class Main {
    public static void main(String[] args) {
        
        System.out.println(Algorithm.getNumDigits(101));
        System.out.println(Algorithm.getNumDigits(2315664));
        
        System.out.println();
        
        System.out.println(Algorithm.divisible(6, 3));
        System.out.println(Algorithm.divisible(7, 3));
        System.out.println(Algorithm.divisible(1, 2));

        System.out.println();
        
        System.out.println(Algorithm.getOddSum(5, 7));
        System.out.println(Algorithm.getOddSum(6, 12));

        System.out.println();
        
        System.out.println(Algorithm.getTenSum(10, 20));
        System.out.println(Algorithm.getTenSum(15, 51));

        System.out.println();
        
        System.out.println(Algorithm.getDigitSum(19));
        System.out.println(Algorithm.getDigitSum(1));

        System.out.println();
        
        System.out.println(Algorithm.getPowerOfTwo(260));
        System.out.println(Algorithm.getPowerOfTwo(1024));
    }
}
