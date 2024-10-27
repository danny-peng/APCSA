public class LightSource {
    private boolean on; 
    private String color;
    private int brightness;
    
    public LightSource() {
        color = "White";
    }

    public LightSource(String color) {
        this.color = color;
    }

    public void turnOn(int brightness) {
        on = true;
        this.brightness = brightness;
        System.out.println("Brightness set to " + this.brightness);
    }
}
