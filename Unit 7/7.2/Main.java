import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<Integer>();
        System.out.println(ints);

        System.out.println(ints.size());

        System.out.println(ints.add(2));
        System.out.println(ints);

        ints.add(0, 0);
        System.out.println(ints);

        System.out.println(ints.get(1));
        System.out.println(ints.set(1, 1));
        System.out.println(ints);

        System.out.println(ints.remove(1));
        System.out.println(ints);
    }
}
