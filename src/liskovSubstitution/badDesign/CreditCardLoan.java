package liskovSubstitution.badDesign;

public class CreditCardLoan implements LoanPayment{
    @Override
    public void makePayment(int amount) {

    }

    @Override
    public void foreClosedLoan() {
        throw new UnsupportedOperationException("Fore closure is not PERMITTED");

    }

    @Override
    public void rePayment(int amount) {

    }
}
