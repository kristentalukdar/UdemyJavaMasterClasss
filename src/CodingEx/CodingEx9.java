package CodingEx;

public class CodingEx9 {

    public static double area(double radius){
        if(radius<0){
            return -1.0;
        }
        double a= Math.PI*radius*radius;
        return a;
    }

    public static double area(double x, double y){
        if((x<0) || (y<0)){
            return -1.0;
        }
        double a= x*y;
        return a;
    }

    public static void main(String[] args) {

    }
}
