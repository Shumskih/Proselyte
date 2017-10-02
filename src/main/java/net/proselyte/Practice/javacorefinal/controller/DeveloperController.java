package main.java.net.proselyte.Practice.javacorefinal.controller;

import main.java.net.proselyte.Practice.javacorefinal.dao.JavaIODeveloperDAOImpl;
import main.java.net.proselyte.Practice.javacorefinal.model.Developer;

public class DeveloperController {
    private JavaIODeveloperDAOImpl javaIODeveloperDAOImpl = new JavaIODeveloperDAOImpl();

    public void save(Developer developer) {
        javaIODeveloperDAOImpl.save(developer);
    }

    public void update(Developer developer) {
        javaIODeveloperDAOImpl.update(developer);
    }

    public Developer getById(int id) {
        javaIODeveloperDAOImpl.getById(id);
        return null;
    }

    public void showAllDevelopers() {
        javaIODeveloperDAOImpl.showAllDevelopers();
    }
}
