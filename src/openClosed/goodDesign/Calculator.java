package openClosed.goodDesign;


//NO MODIFICATION IS TOLERATED IN OUR CALCULATOR CLASS ONLY EXTENSION IS ALLOWED IF THERE ARE ANY NEW FUNCTIONALITIES TO BE IMPLEMENTED

public class Calculator {

    public int calculateNumbers(int numb1,int numb2,Operation operation){

        return operation.perform(numb1,numb2);
    }
}
