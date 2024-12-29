package Bank;
import java.util.ArrayList;
import java.util.List;
public class Bank {
    private String name;
    private List<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Added customer: " + customer.getName());
    }

    public void showCustomers() {
        System.out.println("Customers of " + name + ":");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    public void searchCustomerByName(String name) {
        System.out.println("Searching for customers with name: " + name);
        for (Customer customer : customers) {
            if (customer.getName().equalsIgnoreCase(name)) {
                System.out.println(customer);
            }
        }
    }
}

