package interfaceSegregation.goodDesign;



public class Dog extends Pet {

    @Override
    void groom() {
        super.groom();
    }

    @Override
    void eat() {
        super.eat();
    }
}
