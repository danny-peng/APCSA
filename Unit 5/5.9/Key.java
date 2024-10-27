public class Key {
    private int pins;

    public Key(int pins) {
        this.pins = pins;
    }

    public int getPins() {
        return pins;
    }

    public void useOnLock(Lock lock) {
        lock.toggleLockState(this);
    }
}
