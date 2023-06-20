package openClosed.badDesign;


// >>>> THIS CLASS VIOLETS THE OPEN CLOSED PRINCIPLE,SINCE IT IS DESIGNED IN A WAY THAT
// IF WE WANT TO ADD EXTRA OPERATIONS LIKE MULTIPLICATION AND DIVISION WE HAVE TO MODIFY
// THE CLASS WHICH IS WRONG ,ONLY EXTENSION SHOULD BE ACCOMMODATED.. >>>>

public class Calculator {

    public int calculateNumbers(int numb1,int numb2,String type){
        int result =0;
        switch (type){
            case "addition":
                result = numb1 + numb2;
            case "subtraction":
                result = numb1 - numb2;
        }
        return result;
    }
}
