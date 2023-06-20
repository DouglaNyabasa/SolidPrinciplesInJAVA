package liskovSubstitution.badDesign;

public interface LoanPayment {

    public void makePayment(int amount);
    public void foreClosedLoan();
    public void rePayment(int amount);
}
