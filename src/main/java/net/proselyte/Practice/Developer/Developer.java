package main.java.net.proselyte.Practice.Developer;


class Developer {

    private Integer id;
    private String name;
    private String surname;
    private String specialization;
    private Integer experience;
    private Integer salary;

    Developer() {
    }

    Developer(Integer id, String name, String surname, String specialization, Integer experience, Integer salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
        this.experience = experience;
        this.salary = salary;
    }

    public int setId(Integer id) {
        return this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String setSurname(String surname) {
        return this.surname = surname;
    }

    public String getSurname() {
        return this.surname;
    }

    public String setSpecialization(String specialization) {
        return this.specialization = specialization;
    }

    public String getSpecialization() {
        return this.specialization;
    }

    public int setExperience(Integer experience) {
        return this.experience = experience;
    }

    public int getExperience() {
        return this.experience;
    }

    public int setSalary(Integer salary) {
        return this.salary = salary;
    }

    public int getSalary() {
        return this.salary;
    }
}

