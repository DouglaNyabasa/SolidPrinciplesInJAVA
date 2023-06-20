package dependencyInversion.badDesign;

// THIS CODE BREAKS THE DEPENDENCY INVERSION PRINCIPLE FOR INSTANCE IF WE WANT TO USE THE CREDIT CARD.WE HAVE TO CHANGE THE WHOLE CODE
// THEREFORE THE SHOPPING MALL SHOULD RELLY MORE ON ABSTRACT CONCRETE CLASSES
public class ShoppingMall {
    private DebitCard debitCard;

    public ShoppingMall(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    public void doPurchase(long amount){
        debitCard.doTransaction(amount);
    }

    public static void main(String[] args){
        DebitCard debitCard1 = new DebitCard();
        ShoppingMall shoppingMall = new ShoppingMall(debitCard1);
        shoppingMall.doPurchase(1000);
    }
}
