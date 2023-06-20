package openClosed.goodDesign;

public class SubtractOperation implements Operation{
    @Override
    public int perform(int numb1, int numb2) {
        return  numb1 -  numb2;
    }
}
