package Animal;

public class Fish extends Animal implements Aquatic {
    private String habitat;

    public Fish(String name, String habitat) {
        super(name);
        this.habitat = habitat;
    }

    @Override
    public String getHabitat() {
        return habitat;
    }

    @Override
    public void describe() {
        System.out.println("Fish: " + getName());
        System.out.println("Habitat: " + getHabitat());
    }
}