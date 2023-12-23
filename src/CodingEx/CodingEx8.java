package CodingEx;

public class CodingEx8 {

    public static boolean hasTeen(int a, int b, int c){
        return ((isTeen(a)) || isTeen(b) || isTeen(c));
    }

    public static boolean isTeen(int num){
        if((num>=13) && (num<=19)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
