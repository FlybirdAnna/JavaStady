package Transport;

public class Truck extends Transport implements HasWheels, CarriesCargo {
    private int wheels;
    private int cargo;

    public Truck(String name, int wheels, int cargo) {
        super(name);
        this.wheels = wheels;
        this.cargo = cargo;
    }

    @Override
    public int getWheels() {
        return wheels;
    }

    @Override
    public int getCargoCapacity() {
        return cargo;
    }

    @Override
    public void showInfo() {
        System.out.println("Truck: " + getName());
        System.out.println("Wheels: " + getWheels());
        System.out.println("CarriesCargo: " + getCargoCapacity());
    }
}
