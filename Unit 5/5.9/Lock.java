public class Lock {
    private int pins;
    private boolean lockState;

    public Lock(int pins, boolean lockState) {
        this.pins = pins;
        this.lockState = lockState;
    }


    public boolean isLocked() {
        return lockState;
    }

    public void toggleLockState(Key key) {
        if (key.getPins() == pins) {
            lockState = !lockState;
        }
    }
}
