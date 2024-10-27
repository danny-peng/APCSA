public class Main {
    public static void main(String[] args) {
        Lock lock = new Lock(5, true);
        Key key = new Key(5);
    
        System.out.println(lock.isLocked());
        System.out.println();

        key.useOnLock(lock);

        System.out.println(lock.isLocked());
    }
}
