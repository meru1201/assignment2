package Bank;
public class Main {
    public static void main(String[] args) {

        Bank myBank = new Bank("Global Bank");

        BankAccount account1 = new BankAccount("12345", 1000.00);
        BankAccount account2 = new BankAccount("67890", 500.00);

        Customer customer1 = new Customer("Amina", "C001", account1);
        Customer customer2 = new Customer("Adilet", "C002", account2);
        myBank.addCustomer(customer1);
        myBank.addCustomer(customer2);
        myBank.showCustomers();
        myBank.searchCustomerByName("Amina");
        account1.deposit(200.00);
        account1.withdraw(50.00);
        account2.deposit(100.00);
        account2.withdraw(600.00);
        System.out.println("Customer account details:");
        System.out.println(customer1);
        System.out.println(customer2);
    }
}
