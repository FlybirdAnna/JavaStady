package Animal;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Kisa", "Short", "Spine");
        Animal bear = new Bear("Kolya", "Brown", "Spine");
        Animal whale = new Whale("Charly", "Ocean", "Spine");
        Animal fish = new Fish("Dory", "River");

        cat.describe();
        System.out.println();

        bear.describe();
        System.out.println();

        whale.describe();
        System.out.println();

        fish.describe();
    }
}
