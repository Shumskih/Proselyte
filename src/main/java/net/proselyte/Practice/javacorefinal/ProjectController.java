package main.java.net.proselyte.Practice.javacorefinal;

public class ProjectController {
    private ProjectDAO projectDAO = new ProjectDAO();

    public void save(Project project) {
        projectDAO.save(project);
    }

    public void update(Project project) {
        projectDAO.update(project);
    }

    public void getById(int id) {
        projectDAO.getById(id);
    }

    public void showAllProjects() {
        projectDAO.showAllProjects();
    }
}
