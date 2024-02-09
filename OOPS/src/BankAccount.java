public class BankAccount {
    private long accountNumber;
    private double accountBalance;
    private String customerName;

    public BankAccount () {
        this(111110,100,"Sanksar");
        System.out.println("Empty constructor called");
    }
    public BankAccount (long accountNumber, double accountBalance,String customerName) {
        System.out.println("Constructor with params called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
    }

    public BankAccount (BankAccount bankAccount) {
        this.accountNumber = bankAccount.accountNumber;
        this.accountBalance = bankAccount.accountBalance;
        this.customerName = bankAccount.customerName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    private void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void withdraw (double amount) {
        if (amount > this.accountBalance) {
            System.out.println("Insufficient balance");
            return;
        }
        setAccountBalance(this.accountBalance - amount);
        System.out.println(amount + " withdrawn. Current balance -> " + getAccountBalance());
    }

    public void deposit (int amount) {
        setAccountBalance(this.accountBalance + amount);
        System.out.println(amount + " deposited. Current balance -> " + getAccountBalance());
    }

    public void accountSummary () {
        System.out.println("Name: " + getCustomerName());
        System.out.println("Account number: " + getAccountNumber());
        System.out.println("Balance: " + getAccountBalance());
    }
}
