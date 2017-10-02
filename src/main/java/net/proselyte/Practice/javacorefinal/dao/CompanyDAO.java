package main.java.net.proselyte.Practice.javacorefinal.dao;

import main.java.net.proselyte.Practice.javacorefinal.model.Company;

public interface CompanyDAO {
    void save(Company company);

    void update(Company company);

    void getById(Integer id);

    void showAllCompanies();
}
