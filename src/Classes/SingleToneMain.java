package Classes;

public class SingleToneMain {

    public static void main(String[] args) {
        SingleTone s1= SingleTone.getInstance();
        s1.setData("Hello");
        System.out.println(s1.getData());

        SingleTone s2= SingleTone.getInstance();
        System.out.println(s2.getData());
        s2.setData("Kristen");

        System.out.println(s1.getData());
        System.out.println(s2.getData());
    }

}
