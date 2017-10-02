package main.java.net.proselyte.Practice.javacorefinal.dao;

import main.java.net.proselyte.Practice.javacorefinal.model.Customer;

public interface CustomerDAO {
    void save(Customer customer);

    void update(Customer customer);

    void getById(Integer id);

    void showAllCustomers();
}
