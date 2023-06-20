package dependencyInversion.badDesign;

public class DebitCard {
    public void doTransaction(long amount){
        System.out.println("pay with debit card");
    }
}
