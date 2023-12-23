package CodingEx;

public class CodingEx2 {
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1;
        }
        double result;
        result= kilometersPerHour*0.621371;
        long lResult= (long) result;
        return lResult;
    }

    public static void printConversion(double kilometersPerHour){
        long result=toMilesPerHour(kilometersPerHour);
        if(result==-1){
            System.out.println("Invalid value");
        }
        System.out.println(kilometersPerHour+ "km/h="+ result + "mi/h");
    }



    public static void main(String[] args) {
        printConversion(25.42);

    }
}
