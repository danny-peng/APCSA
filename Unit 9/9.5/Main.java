import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Vehicle civic = new Car();
        VehicleOperator john = new VehicleOperator();

        john.operate(civic);

        Vehicle[] vehicles = {civic};
        System.out.println(vehicles[0]);

        ArrayList<Vehicle> moreVehicles = new ArrayList<Vehicle>();
        moreVehicles.add(civic);
        System.out.println(moreVehicles);
    }
}
