package Classes;

public class BankMain {

    public static void main(String[] args) {
        BankAccount b=new BankAccount();

        b.setAccountNumber("101");
        b.setCustomerName("Kristen");
        b.setEmail("kristen123@gmail.com");
        b.setAccountBalance(1000);
    /*
        b.deposit(2000);
        b.withdraw(5000);
        b.withdraw(100);

        //System.out.println(b.getAccountBalance());

        BankAccount a= new BankAccount("105", 5000, "Bob", "bob@email.com", "1236743");

        System.out.println(a.getAccountNumber());
    */
        BankAccount c =new BankAccount("110");
        System.out.println(c.getAccountNumber());
    }
}
