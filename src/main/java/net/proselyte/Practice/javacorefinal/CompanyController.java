package main.java.net.proselyte.Practice.javacorefinal;

public class CompanyController {
    private CompanyDAO companyDAO = new CompanyDAO();

    public void save(Company company) {
        companyDAO.save(company);
    }

    public void update(Company company) {
        companyDAO.update(company);
    }

    public Developer getById(int id) {
        companyDAO.getById(id);
        return null;
    }

    public void showAllCompanies() {
        companyDAO.showAllCompanies();
    }
}
