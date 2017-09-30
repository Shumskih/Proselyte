package main.java.net.proselyte.Practice.javacorefinal;

public class DeveloperController {
    private DeveloperDAO developerDAO = new DeveloperDAO();

    public void save(Developer developer) {
        developerDAO.save(developer);
    }

    public void update(Developer developer) {
        developerDAO.update(developer);
    }

    public Developer getById(int id) {
        developerDAO.getById(id);
        return null;
    }

    public void showAllDevelopers() {
        developerDAO.showAllDevelopers();
    }
}
