import java.util.Scanner;

public class Pet {
    private String name;
    private String species;
    private int lvl = 1;
    private int baseAtk = 2;

    
    Scanner s = new Scanner(System.in);

    public Pet(String species) {
        this.species = species;
    }
    
    public Pet(String species, int baseAtk)  {
        this.species = species;
        this.baseAtk = baseAtk;
    }

    public void rename() {
        System.out.println("Enter the new name: ");

        name = s.nextLine();

        System.out.println("Renamed to " + name);
    }

    public String getName() {
        try {
            name.isEmpty();
        } catch (NullPointerException e) {
            System.out.println("Your pet does not have a name yet!");
            return "N/A";
        }
        return name;
    }
}
