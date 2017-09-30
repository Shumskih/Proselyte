package main.java.net.proselyte.Practice.javacorefinal;

public class CustomerController {
    private CustomerDAO customerDAO = new CustomerDAO();

    public void save(Customer customer) {
        customerDAO.save(customer);
    }

    public void update(Customer customer) {
        customerDAO.update(customer);
    }

    public Developer getById(int id) {
        customerDAO.getById(id);
        return null;
    }

    public void showAllCustomers() {
        customerDAO.showAllCustomers();
    }
}
