package Transport;

public class Boat extends Transport implements HasPropeller, CarriesCargo {
    private int propeller;
    private int cargo;

    public Boat(String name, int propeller, int cargo) {
        super(name);
        this.propeller = propeller;
        this.cargo = cargo;
    }

    @Override
    public int getPropeller() {
        return propeller;
    }

    @Override
    public int getCargoCapacity() {
        return cargo;
    }

    @Override
    public void showInfo() {
        System.out.println("Boat: " + getName());
        System.out.println("Propeller: " + getPropeller());
        System.out.println("CarriesCargo: " + getCargoCapacity());
    }
}
