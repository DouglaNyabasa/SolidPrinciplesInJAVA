package dependencyInversion.goodDesign;

public class CreditCard implements BankCard{


    public void doTransaction(long amount){
        System.out.println("pay with credit card");
    }
}
