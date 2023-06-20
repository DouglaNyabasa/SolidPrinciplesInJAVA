package interfaceSegregation.badDesign;

// Dummy implementation of the groom method which is not applicable to the Lion CLass
public class Lion extends Animal{
    @Override
    void eat() {
        super.eat();
    }


    @Override
    void groom() {
        super.groom();
    }
}
