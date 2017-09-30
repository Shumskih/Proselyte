package main.java.net.proselyte.Practice.javacorefinal;

public class Skill {
    private Integer id;
    private String skill;

    Skill() {
    }

    public Skill(Integer id, String skill) {
        this.id = id;
        this.skill = skill;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

}
