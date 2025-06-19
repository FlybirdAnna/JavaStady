package Transport;

public class Airplane extends Transport implements HasWheels, HasPropeller, HasWings, CarriesCargo {
    private int wheels;
    private int propeller;
    private int wings;
    private int cargo;

    public Airplane(String name, int wheels, int propeller, int wings, int cargo) {
        super(name);
        this.wheels = wheels;
        this.propeller = propeller;
        this.wings = wings;
        this.cargo = cargo;
    }

    @Override
    public int getWheels() {
        return wheels;
    }

    @Override
    public int getPropeller() {
        return propeller;
    }

    @Override
    public int getWings() {
        return wings;
    }

    @Override
    public int getCargoCapacity() {
        return cargo;
    }

    @Override
    public void showInfo() {
        System.out.println("Airplane: " + getName());
        System.out.println("Wheels: " + getWheels());
        System.out.println("Propeller: " + getPropeller());
        System.out.println("Wings: " + getWings());
        System.out.println("CarriesCargo: " + getCargoCapacity());
    }
}