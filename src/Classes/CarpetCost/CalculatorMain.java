package Classes.CarpetCost;

import CodingEx.SimpleCalculator;

public class CalculatorMain {

    public static void main(String[] args) {
        SimpleCalculator s= new SimpleCalculator();
        s.setFirstNumber(10.25);
        s.setSecondNumber(5.75);

        s.getAdditionResult();
        s.getSubtractionResult();
        s.getMultiplicationResult();
        s.getDivisionResult();

    }

}
