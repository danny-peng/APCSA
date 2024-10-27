import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String[] a = new String[] {"zebra", "alpha"};
        Algorithm.selectionSort(a);
        Algorithm.print(a);

        String[] b = new String[] {"beta", "digital", "cheese"};
        Algorithm.selectionSort(b);
        Algorithm.print(b);

        String[] c = new String[] {"beta", "cheese"};
        Algorithm.selectionSort(c);
        Algorithm.print(c);
        System.out.println();


        a = new String[] {"zebra", "alpha"};
        Algorithm.insertionSort(a);
        Algorithm.print(a);

        b = new String[] {"beta", "digital", "cheese"};
        Algorithm.insertionSort(b);
        Algorithm.print(b);

        c = new String[] {"beta", "cheese"};
        Algorithm.insertionSort(c);
        Algorithm.print(c);
        System.out.println();

        
        ArrayList<String> d = new ArrayList<String>();
        d.add("zebra");
        d.add("alpha");
        Algorithm.selectionSortArrListStr(d);
        System.out.println(d);

        d = new ArrayList<String>();
        d.add("beta");
        d.add("digital");
        d.add("cheese");
        Algorithm.selectionSortArrListStr(d);
        System.out.println(d);

        d = new ArrayList<String>();
        d.add("beta");
        d.add("cheese");
        Algorithm.selectionSortArrListStr(d);
        System.out.println(d);
        System.out.println();


        d = new ArrayList<String>();
        d.add("zebra");
        d.add("alpha");
        Algorithm.insertionSortArrListStr(d);
        System.out.println(d);
        
        d = new ArrayList<String>();
        d.add("beta");
        d.add("digital");
        d.add("cheese");
        Algorithm.insertionSortArrListStr(d);
        System.out.println(d);
        
        d = new ArrayList<String>();
        d.add("beta");
        d.add("cheese");
        Algorithm.insertionSortArrListStr(d);
        System.out.println(d);
        System.out.println();

        ArrayList<Integer> e = new ArrayList<Integer>();
        e.add(1);
        e.add(0);
        e.add(-1);
        Algorithm.selectionSort(e);
        System.out.println(e);
        e = new ArrayList<Integer>();
        e.add(1);
        e.add(0);
        Algorithm.selectionSort(e);
        System.out.println(e);
        e = new ArrayList<Integer>();
        e.add(-1);
        e.add(0);
        e.add(-1);
        Algorithm.selectionSort(e);
        System.out.println(e);
        System.out.println();

        e = new ArrayList<Integer>();
        e.add(1);
        e.add(0);
        e.add(-1);
        Algorithm.insertionSort(e);
        System.out.println(e);
        e = new ArrayList<Integer>();
        e.add(1);
        e.add(0);
        Algorithm.insertionSort(e);
        System.out.println(e);
        e = new ArrayList<Integer>();
        e.add(-1);
        e.add(0);
        e.add(-1);
        Algorithm.insertionSort(e);
        System.out.println(e);
    }
}
