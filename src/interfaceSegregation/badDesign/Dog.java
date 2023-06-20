package interfaceSegregation.badDesign;

public class Dog extends Animal{
    @Override
    void eat() {
        super.eat();
    }

    @Override
    void groom() {
        super.groom();
    }
}
