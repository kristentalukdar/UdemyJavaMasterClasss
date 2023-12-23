package Classes.Bank;

public class BankAccount {

    private String accountNumber;
    private int accountBalance;
    private String customerName;
    private String email;
    private String phoneNo;

    //Temp Comment--By KRISTEN
    public BankAccount(){
        System.out.println("An instance of BankAccount is created- Empty constructor");
    }

    public BankAccount(String accountNumber, String customerName, String email) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.email = email;
    }

    public BankAccount(String accountNumber){
        this();
        this.accountNumber=accountNumber;
    }

    public BankAccount(String accountNumber, int accountBalance, String customerName, String email, String phoneNo){
        System.out.println("The constructor with parameters is called");
        this.accountNumber=accountNumber;
        this.accountBalance=accountBalance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNo=phoneNo;
    }

    public void deposit(int amount){
        this.accountBalance+=amount;
        System.out.println("The amount deposited is: "+ amount);
        System.out.println("The new balance is: "+ accountBalance);
    }

    public void withdraw(int amount){
        if(amount>accountBalance){
            System.out.println("Not allowed to withdraw an amount of: "+ amount);
            return;
        }
        this.accountBalance-=amount;
        System.out.println("Amount withdrawn is: "+ amount);
        System.out.println("The remaining balance is: "+ accountBalance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
