package main.java.net.proselyte.Practice.javacorefinal.controller;

import main.java.net.proselyte.Practice.javacorefinal.dao.JavaIOCompanyDAOImpl;
import main.java.net.proselyte.Practice.javacorefinal.model.Company;
import main.java.net.proselyte.Practice.javacorefinal.model.Developer;

public class CompanyController {
    private JavaIOCompanyDAOImpl javaIOCompanyDAOImpl = new JavaIOCompanyDAOImpl();

    public void save(Company company) {
        javaIOCompanyDAOImpl.save(company);
    }

    public void update(Company company) {
        javaIOCompanyDAOImpl.update(company);
    }

    public Developer getById(int id) {
        javaIOCompanyDAOImpl.getById(id);
        return null;
    }

    public void showAllCompanies() {
        javaIOCompanyDAOImpl.showAllCompanies();
    }
}
