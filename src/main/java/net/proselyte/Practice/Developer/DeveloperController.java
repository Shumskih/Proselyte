package main.java.net.proselyte.Practice.Developer;

public class DeveloperController {

   private DeveloperDAO developerDAO = new DeveloperDAO();

    public void save(Developer developer) {
        developerDAO.save(developer);
    }

    public void update(Developer developer) {
        developerDAO.update(developer);
    }

    public void remove(int id) {
        developerDAO.remove(id);
    }

    public Developer getById(int id) {
        developerDAO.getById(id);
        return null;
    }


}
