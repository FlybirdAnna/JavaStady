package Transport;

public class Helicopter extends Transport implements HasWheels, HasPropeller, CarriesCargo {
    private int wheels;
    private int propeller;
    private int cargo;

    public Helicopter(String name, int wheels, int propeller, int cargo) {
        super(name);
        this.wheels = wheels;
        this.propeller = propeller;
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
    public int getCargoCapacity() {
        return cargo;
    }

    @Override
    public void showInfo() {
        System.out.println("Helicopter: " + getName());
        System.out.println("Wheels: " + getWheels());
        System.out.println("Propeller: " + getPropeller());
        System.out.println("CarriesCargo: " + getCargoCapacity());
    }
}
