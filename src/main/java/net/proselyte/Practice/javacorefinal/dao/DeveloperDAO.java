package main.java.net.proselyte.Practice.javacorefinal.dao;

import main.java.net.proselyte.Practice.javacorefinal.model.Developer;

public interface DeveloperDAO {
    void save(Developer developer);

    void update(Developer developer);

    void getById(Integer id);

    void showAllDevelopers();
}
