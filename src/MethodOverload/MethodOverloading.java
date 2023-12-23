package MethodOverload;

public class MethodOverloading {

    public static double convertToCentimeters(int heightInches){
        double heightCenti= (double) (heightInches*2.54);
        return heightCenti;

    }

    public static double convertToCentimeters(int heightFeet, int heightInches) {
        int convertInches= heightFeet*12;
        int finalInches= convertInches+heightInches;
       double result = convertToCentimeters(finalInches);
       return result;
    }

    public static String getDurationString(int seconds) {

        int minutes = seconds / 60;
        return getDurationString(minutes, seconds);
    }

    public static String getDurationString(int minutes, int seconds) {

        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
    }





    public static void main(String[] args) {
        System.out.println("The conversion value is: "+convertToCentimeters(5, 8));

        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));
    }
}
