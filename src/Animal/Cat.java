package Animal;

public class Cat extends Mammal implements HasFur {
    private String furType;

    public Cat(String name, String furType, String vertebrate) {
        super(name, vertebrate);
        this.furType = furType;
    }

    @Override
    public String getFurType() {
        return furType;
    }

    @Override
    public void describe() {
        System.out.println("Cat: " + getName());
        System.out.println("Fur: " + getFurType());
        System.out.println("VertebrateType: " + getVertebrate());
    }
}
