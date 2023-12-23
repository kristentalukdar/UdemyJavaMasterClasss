package CodingEx;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public double getAdditionResult(){
        double sum= firstNumber+secondNumber;
        System.out.println("The sum of "+ firstNumber+ " and " + secondNumber+" is: "+sum);
        return sum;
    }

    public double getSubtractionResult(){
        double diff= firstNumber-secondNumber;
        System.out.println("The difference of "+ firstNumber+ " and " + secondNumber+" is: "+diff);
        return diff;
    }

    public double getMultiplicationResult(){
        double prod= firstNumber*secondNumber;
        System.out.println("The product of "+ firstNumber+ " and " + secondNumber+" is: "+prod);
        return prod;
    }

    public double getDivisionResult(){
        if(secondNumber==0){
            return 0;
        }
        double div= firstNumber/secondNumber;
        System.out.println("The Quotient of "+ firstNumber+ " and " + secondNumber+" is: "+div);
        return div;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
}
