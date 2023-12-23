package CodingEx;

public class CodingEx1 {
    public static void checkNumber(int number){
        int num= number;
        if(num>0){
            System.out.println("positive");
        }
        else if (num<0) {
            System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }
    }

    public static void main(String[] args) {
    checkNumber(50);
    checkNumber(0);
    checkNumber(-10);
    }
}
