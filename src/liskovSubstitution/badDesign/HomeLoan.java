package liskovSubstitution.badDesign;

public class HomeLoan implements LoanPayment{
    @Override
    public void makePayment(int amount) {

    }

    @Override
    public void foreClosedLoan() {

    }

    @Override
    public void rePayment(int amount) {

    }
}
