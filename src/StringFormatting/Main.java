package StringFormatting;

public class Main {
    public static void main(String[] args) {

        String textBlock= """
                Print a bulleted list:
                    \u2022 First Point
                        \u2022 Sub Point
                """;
        System.out.println(textBlock);

        int birthYear=2005;
        int age=2023-birthYear;
        System.out.printf("Age= %d and Birth year= %d.%n", age, birthYear);
        System.out.printf("Age =%.5f %n", (float)age);

        String str="Kristen Talukdar";
        System.out.printf("Length= %d %n", str.length());
        System.out.printf("First char= %c %n", str.charAt(0));

    }
}
