package dependencyInversion.goodDesign;

public class DebitCard implements BankCard{

    public void doTransaction(long amount){
        System.out.println("pay with debit card");
    }
}
