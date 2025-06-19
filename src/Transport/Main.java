package Transport;

public class Main {
    public static void main(String[] args) {
        Transport airplane = new Airplane("Airbus", 8, 2, 2, 500);
        Transport helicopter = new Helicopter("Kobra", 3, 1, 10);
        Transport boat = new Boat("My Sun", 1, 3);
        Transport tanker = new Tanker("Star", 3, 3000);
        Transport truck = new Truck("Kia", 16, 50);
        Transport taxi = new Taxi("Kia Rio", 4);

        airplane.showInfo();
        System.out.println();

        helicopter.showInfo();
        System.out.println();

        boat.showInfo();
        System.out.println();

        tanker.showInfo();
        System.out.println();

        truck.showInfo();
        System.out.println();

        taxi.showInfo();
        System.out.println();
    }
}