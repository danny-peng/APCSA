public class Lamp extends LightSource {
    public Lamp() {}

    public Lamp(String color) {
        super(color);
    }

    public void turnOn(int brightness) {
        super.turnOn(brightness);
        System.out.println("Lamp has been turned on");
    }
}
