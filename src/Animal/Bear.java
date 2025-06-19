package Animal;

public class Bear extends Mammal implements HasFur {
    private String furType;

    public Bear(String name, String furType, String vertebrate) {
        super(name, vertebrate);
        this.furType = furType;
    }

    @Override
    public String getFurType() {
        return furType;
    }

    @Override
    public void describe() {
        System.out.println("Bear: " + getName());
        System.out.println("Fur: " + getFurType());
        System.out.println("VertebrateType: " + getVertebrate());
    }
}
