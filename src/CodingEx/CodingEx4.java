package CodingEx;

public class CodingEx4 {
    /*public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        boolean result=false;
        if((hourOfDay>=0)&& (hourOfDay<=23)){
            if(barking) {
                if ((hourOfDay < 8) || (hourOfDay > 22)) {
                    result=true;
                }
            }
        }
        return result;
    }*/

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (!((hourOfDay>=0)&& (hourOfDay<=23))) {
            return false;
        }
        return (barking) && ((hourOfDay < 8) || (hourOfDay > 22));
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(true, 2));

    }
}
