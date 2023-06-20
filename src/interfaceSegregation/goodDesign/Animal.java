package interfaceSegregation.goodDesign;

//THE ANIMAL CLASS HAS ONLY ONE METHOD WHICH IS EAT THIS METHOD IS APPLICABLE TO ALL ITS SUB CLASSES
public class Animal {
    void eat(){
        System.out.println("animal eats");
    }

}
