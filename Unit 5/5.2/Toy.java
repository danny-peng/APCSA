public class Toy {
    private boolean squeaky;
    
    public Toy() {
        squeaky = false;
    }

    public Toy(boolean s) {
        squeaky = s;
    }

    public boolean isSqueaky() {
        return squeaky;
    }
    
    public void setSqueaky(boolean newSqueaky) {
        squeaky = newSqueaky;
    }
}
