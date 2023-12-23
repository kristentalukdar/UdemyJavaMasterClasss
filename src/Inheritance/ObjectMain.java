package Inheritance;

public class ObjectMain extends Object{
    public static void main(String[] args) throws CloneNotSupportedException {
        Animal a1= new Animal("Type1", "Small", 12);
        System.out.println(a1);
        Animal a2= (Animal) a1.clone();
        a2.type="Type2";
        System.out.println(a2);

        System.out.println(a1.equals(a2));
        Animal a3=a1;
        System.out.println(a3.type);
        System.out.println(a1.equals(a3));
        System.out.println(a1.hashCode()+ "     "+ a2.hashCode()+"         "+ a3.hashCode());

    }
}
