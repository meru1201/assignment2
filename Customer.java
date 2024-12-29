package Bank;
public class Customer {
    private String name;
    private String id;
    private BankAccount account;
    public Customer(String name, String id, BankAccount account) {
        this.name = name;
        this.id = id;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public BankAccount getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "CustomerID: " + id + ", Name: " + name + ", " + account;
    }
}
