package StringFormatting;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String string= new String("Hello World");
        StringBuilder stringBuilder= new StringBuilder("Hello World");
        printInformation(string);
        printInformation(stringBuilder);
    }

    public static void printInformation(String string){
        System.out.println("The string is: "+ string);
        System.out.println("The length of string is: "+string.length());
    }

    public static void printInformation(StringBuilder stringBuilder){
        System.out.println("The string builder is: "+ stringBuilder);
        System.out.println("The length of string builder is: "+ stringBuilder.length());
    }
}
