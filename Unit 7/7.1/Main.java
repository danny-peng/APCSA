import java.util.ArrayList;
public class Main {
public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<Integer>();
        ints.add(0);
        ints.add(1);
        System.out.println(ints);
        
        ArrayList<Double> doubles = new ArrayList<Double>();
        doubles.add(0.0);
        doubles.add(1.0);
        System.out.println(doubles);
        
        ArrayList<Boolean> booleans = new ArrayList<Boolean>();
        booleans.add(false);
        booleans.add(true);
        System.out.println(booleans);
        
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("Hello ");
        strings.add("world!");
        System.out.println(strings);
        
        ArrayList<Furniture> furnitures = new ArrayList<Furniture>();
        furnitures.add(new Furniture("Table"));
        furnitures.add(new Furniture("Chair"));
        System.out.println(furnitures);
        
        ArrayList everything = new ArrayList();
        everything.add(0);
        everything.add(1.0);
        everything.add(false);
        everything.add("Hi");
        everything.add(new Furniture("Sofa"));
        System.out.println(everything);
    }
}
