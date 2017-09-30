package main.java.net.proselyte.Practice.javacorefinal;

public class SkillController {
    private SkillDAO skillDAO = new SkillDAO();

    public void save(Skill skill) {
        skillDAO.save(skill);
    }

    public void update(Skill skill) {
        skillDAO.update(skill);
    }

    public void getById(int id) {
        skillDAO.getById(id);
    }

    public void showAllSkills() {
        skillDAO.showAllSkills();
    }
}
