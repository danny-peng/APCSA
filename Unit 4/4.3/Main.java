public class Main {
    public static void main(String[] args) {
        System.out.println(Algorithm.strContains("homework", "work"));
        System.out.println(Algorithm.strContains("abc", "d"));
        System.out.println();

        System.out.println(Algorithm.reverseStr("Java"));
        System.out.println(Algorithm.reverseStr("reversed"));
        System.out.println();


        System.out.println(Algorithm.isPalindrome("APCSA"));
        System.out.println(Algorithm.isPalindrome("tacocat"));
        System.out.println();


        System.out.println(Algorithm.numOccurences("pneumonoultramicroscopicsilicovolcanoconiosis", "c"));
        System.out.println(Algorithm.numOccurences("sssss", "s"));
        System.out.println();
    }
}