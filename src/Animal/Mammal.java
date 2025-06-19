package Animal;

public abstract class Mammal extends Animal implements Vertebrate {
    private String vertebrate;

    public Mammal(String name, String vertebrate) {
        super(name);
        this.vertebrate = vertebrate;
    }

    @Override
    public String getVertebrate() {
        return vertebrate;
    }
}
