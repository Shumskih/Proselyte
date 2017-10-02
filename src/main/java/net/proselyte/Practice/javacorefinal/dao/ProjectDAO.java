package main.java.net.proselyte.Practice.javacorefinal.dao;

import main.java.net.proselyte.Practice.javacorefinal.model.Project;

public interface ProjectDAO {
    void save(Project project);

    void update(Project project);

    void getById(Integer id);

    void showAllProjects();
}
