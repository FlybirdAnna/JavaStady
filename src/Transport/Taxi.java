package Transport;

public class Taxi extends Transport implements HasWheels {
    private int wheels;

    public Taxi(String name, int wheels) {
        super(name);
        this.wheels = wheels;
    }

    @Override
    public int getWheels() {
        return wheels;
    }

    @Override
    public void showInfo() {
        System.out.println("Taxi: " + getName());
        System.out.println("Wheels: " + getWheels());
    }
}
