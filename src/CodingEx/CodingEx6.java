package CodingEx;

public class CodingEx6 {

    /*
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){

        double scale=Math.pow(10, 3);

        double d1= Math.round(num1*scale)/scale;
        double d2= Math.round(num2*scale)/scale;
        if(d1==d2){
            return true;
        }
        return false;
    }
    */


    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {

        long firstRounded = (long) (first * 1000);
        long secondRounded = (long) (second * 1000);
        return firstRounded == secondRounded;
    }


    public static void main(String[] args) {

    }

}
