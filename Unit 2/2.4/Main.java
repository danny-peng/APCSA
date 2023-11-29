public class Main {
    public static void main(String[] args) {
        Timer t = new Timer();

        System.out.println(t.getTime());

        t.decreaseTime();
        System.out.println(t.getTime());

        t.decreaseTime(5.0);
        System.out.println(t.getTime());

        t.snooze();
        System.out.println(t.getTime());
        
        t.snooze(15.0);
        System.out.println(t.getTime());
    }
}