import java.util.LinkedList;

public class AutoboxingChallenge {


}
class Bank {
    private String name;
    private LinkedList<Customer> customers;

    public Bank() {
        this.name = "Anonymous";
        customers = new LinkedList<>();
    }

    public Bank(String name) {
        this.name = name;
        customers = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public LinkedList<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Customer getCustomer(String name) {
        for (var customer : customers) {
            if (customer.getName().equalsIgnoreCase(name)) {
                return customer;
            }
        }
        System.out.println("Customer not found");
        return null;
    }

    public void transaction(String customerName, int amount) {
        Customer customer = getCustomer(customerName);
        if (customer != null) {
            customer.addTransaction(amount);
        }
    }
}
class Customer {
    private String name;
    private LinkedList<Integer> transactions;

    public Customer() {
        this.name = "Unknown";
        transactions = new LinkedList<>();
    }

    public Customer(String name, int initialDeposit) {
        this.name = name;
        transactions = new LinkedList<>();
        transactions.add(initialDeposit);
    }

    public String getName() {
        return name;
    }

    public LinkedList<Integer> getTransactions() {
        return transactions;
    }

    public void addTransaction(int amount) {
        transactions.add(amount);
        if (amount < 0) {
            System.out.println("Debited " + Integer.signum(amount));
        } else {
            System.out.println("Credited " + amount);
        }
    }
}
