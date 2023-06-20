package dependencyInversion.goodDesign;

// WHEN YOU WANT TO MAKE ANY CHANGES YOU HAVE TO CHANGE THE IMPLEMENTATION NOT THE WHOLE CODE LIKE WE DID IN THE PREVIOUS EXAMPLE
public class ShoppingMall {
    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }
    private void doPurchase(long amount) {
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args){
        BankCard bankCard1 = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(bankCard1);
        shoppingMall.doPurchase(1000);
    }


}
