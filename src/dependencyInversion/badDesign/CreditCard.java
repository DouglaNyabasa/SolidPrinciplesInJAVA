package dependencyInversion.badDesign;

public class CreditCard {


    public void doTransaction(long amount){
        System.out.println("pay with credit card");
    }
}
