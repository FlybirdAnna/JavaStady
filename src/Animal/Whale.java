package Animal;

public class Whale extends Mammal implements Aquatic {
    private String habitat;

    public Whale(String name, String habitat, String vertebrate) {
        super(name, vertebrate);
        this.habitat = habitat;
    }

    @Override
    public String getHabitat() {
        return habitat;
    }

    @Override
    public void describe() {
        System.out.println("Whale: " + getName());
        System.out.println("Habitat: " + getHabitat());
        System.out.println("VertebrateType: " + getVertebrate());
    }
}
