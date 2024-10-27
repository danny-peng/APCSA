import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(-1);
        a.add(0);
        a.add(1);
        System.out.println(Algorithm.getNumNegative(a));

        ArrayList<Integer> b = new ArrayList<Integer>();
        b.add(0);
        b.add(1);
        System.out.println(Algorithm.getNumNegative(b));

        ArrayList<Integer> c = new ArrayList<Integer>();
        c.add(-1);
        c.add(-1);
        System.out.println(Algorithm.getNumNegative(c));

        System.out.println();

        ArrayList<String> d = new ArrayList<String>();
        d.add("String");
        System.out.println(Algorithm.containsString(d, "string"));
        
        System.out.println(Algorithm.containsString(d, "String"));

        d.add("Another string");
        System.out.println(Algorithm.containsString(d, "Another string"));

        System.out.println();

        ArrayList<Integer> e = new ArrayList<Integer>();
        e.add(1);
        e.add(2);
        ArrayList<Integer> f = new ArrayList<Integer>();
        f.add(2);
        f.add(3);
        System.out.println(Algorithm.containsOverlap(e, f));
        System.out.println(Algorithm.containsOverlap(e, e));
        ArrayList<Integer> g = new ArrayList<Integer>();
        g.add(3);
        g.add(4);
        System.out.println(Algorithm.containsOverlap(e, g));

        System.out.println();

        ArrayList<Integer> h = new ArrayList<Integer>();
        h.add(1);
        h.add(2);
        h.add(3);
        System.out.println(Algorithm.ArrayListIndexOfInt(h, 2));
        System.out.println(Algorithm.ArrayListIndexOfInt(h, 4));
        System.out.println(Algorithm.ArrayListIndexOfInt(h, 3));

        System.out.println();

        System.out.println(Algorithm.ArrayIndexOfInt(new int[]{1, 2, 3}, 2));
        System.out.println(Algorithm.ArrayIndexOfInt(new int[]{1, 2, 3}, 4));
        System.out.println(Algorithm.ArrayIndexOfInt(new int[]{1, 2, 3}, 3));
    }
}
