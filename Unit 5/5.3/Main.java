/**
 * A class with a method that converts a letter from a-h 
 * to its index equivalent as an integer (0-7)
 * @author Danny Peng
 * @version 1.0 */
public class Main {
    public static void main(String[] args) {
        System.out.println(getIndex("a"));
    }

    /** Returns the index equivalent of letters a-h as an integer (0-7)
     * @param column the letter to be converted
     * @return the index equivalent of letters a-h as an integer (0-7), -1 if the argument is not in a-h */
    public static int getIndex(String column) {
        column = column.toLowerCase();
        if (column.equals("a")) return 0;
        if (column.equals("b")) return 1;
        if (column.equals("c")) return 2;
        if (column.equals("d")) return 3;
        if (column.equals("e")) return 4;
        if (column.equals("f")) return 5;
        if (column.equals("g")) return 6;
        if (column.equals("h")) return 7;

        return -1;
    }
}
