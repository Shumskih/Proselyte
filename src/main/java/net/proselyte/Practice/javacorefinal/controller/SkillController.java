package main.java.net.proselyte.Practice.javacorefinal.controller;

import main.java.net.proselyte.Practice.javacorefinal.dao.JavaIOSkillDAOImpl;
import main.java.net.proselyte.Practice.javacorefinal.model.Skill;

public class SkillController {
    private JavaIOSkillDAOImpl javaIOSkillDAOImpl = new JavaIOSkillDAOImpl();

    public void save(Skill skill) {
        javaIOSkillDAOImpl.save(skill);
    }

    public void update(Skill skill) {
        javaIOSkillDAOImpl.update(skill);
    }

    public void getById(int id) {
        javaIOSkillDAOImpl.getById(id);
    }

    public void showAllSkills() {
        javaIOSkillDAOImpl.showAllSkills();
    }
}
