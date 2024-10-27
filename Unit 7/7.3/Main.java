import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<Integer>();
        ints.add(0);
        ints.add(1);
        ints.add(2);
        ints.add(5);
        ints.add(5);
        ints.add(3);

        for (int i = 0; i < ints.size(); i++) System.out.print(ints.get(i) + " ");
        System.out.println("\n");

        int i = 0;
        while (i < ints.size()) {
            System.out.print(ints.get(i) + " ");
            i++;
        }
        System.out.println("\n");

        for (int num : ints) System.out.print(num + " ");
        System.out.println("\n");

        removeInt(ints, 5);

        for (int num : ints) System.out.print(num + " ");
    }

    public static void removeInt(ArrayList<Integer> ints, int num) {
        for (int i = ints.size()-1; i >= 0; i--) {
            if (ints.get(i) == num) ints.remove(i);
        }
    }
}
