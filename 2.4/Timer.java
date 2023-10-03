public class Timer {
    private double time = 60.00;

    public Timer() {}

    public Timer(double time) {
        this.time = time;
    }

    public void decreaseTime() {
        time--;
    }

    public void decreaseTime(double amount) {
        time -= amount;
    }

    public void snooze() {
        time += 10.0;
    }
    
    public void snooze(double amount) {
        time += amount;
    }

    public double getTime() {
        return time;
    }
}