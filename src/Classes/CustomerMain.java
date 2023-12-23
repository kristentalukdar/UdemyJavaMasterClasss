package Classes;

public class CustomerMain {

    public static void main(String[] args) {

        Customer c1 = new Customer();
        Customer c2 = new Customer("Kristen", 1200.50, "abc@mail.com");
        Customer c3 = new Customer("Manoj", "jkl@mail.com");

        System.out.println(c1.getName());
        System.out.println(c2.getCreditLimit());
        System.out.println(c3.getCreditLimit());
    }


}
