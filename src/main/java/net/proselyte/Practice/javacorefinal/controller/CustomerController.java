package main.java.net.proselyte.Practice.javacorefinal.controller;

import main.java.net.proselyte.Practice.javacorefinal.dao.JavaIOCustomerDAOImpl;
import main.java.net.proselyte.Practice.javacorefinal.model.Customer;
import main.java.net.proselyte.Practice.javacorefinal.model.Developer;

public class CustomerController {
    private JavaIOCustomerDAOImpl javaIOCustomerDAOImpl = new JavaIOCustomerDAOImpl();

    public void save(Customer customer) {
        javaIOCustomerDAOImpl.save(customer);
    }

    public void update(Customer customer) {
        javaIOCustomerDAOImpl.update(customer);
    }

    public Developer getById(int id) {
        javaIOCustomerDAOImpl.getById(id);
        return null;
    }

    public void showAllCustomers() {
        javaIOCustomerDAOImpl.showAllCustomers();
    }
}
