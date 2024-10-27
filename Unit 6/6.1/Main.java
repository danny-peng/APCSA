public class Main {
    public static void main(String[] args) {
        int[] numbers = {15, 20};
    
        Bean redBeans = new Bean("Red", "medium", false);
        Bean blackBeans = new Bean("Black", "large", true);
        Bean[] beans = {redBeans, blackBeans};

        System.out.println(numbers[0]);
        numbers[0] = 10;
        System.out.println(numbers[0]);

        System.out.println();

        System.out.println(beans[0]);
        beans[0].cook();
        System.out.println(beans[0]);
    }
}
