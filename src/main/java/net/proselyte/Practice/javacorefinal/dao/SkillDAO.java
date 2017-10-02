package main.java.net.proselyte.Practice.javacorefinal.dao;

import main.java.net.proselyte.Practice.javacorefinal.model.Skill;

public interface SkillDAO {
    void save(Skill skill);

    void update(Skill skill);

    void getById(Integer id);

    void showAllSkills();
}
