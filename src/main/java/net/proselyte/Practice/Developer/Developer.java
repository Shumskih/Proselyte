package main.java.net.proselyte.Practice.Developer;

import java.io.Serializable;

public class Developer implements Serializable {

    private int id;
    private String name;
    private String surname;
    private String specialization;
    private int experience;
    private int salary;

    Developer() {

    }

    Developer(int id, String name, String surname, String specialization, int experience, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.specialization = specialization;
        this.experience = experience;
        this.salary = salary;
    }

    public int setId(int id) {
        return this.id = id;
    }

    public int getId() {
        System.out.print(this.name + "'s id: ");
        return this.id;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String getName() {
        System.out.print("Developer's name: ");
        return this.name;
    }

    public String setSurname(String surname) {
        return this.surname = surname;
    }

    public String getSurname() {
        System.out.print(name + "'s surname: ");
        return this.surname;
    }

    public String setSpecialization(String specialization) {
        return this.specialization = specialization;
    }

    public String getSpecialization() {
        System.out.print(this.name + "'s specialization: ");
        return this.specialization;
    }

    public int setExperience(int experience) {
        return this.experience = experience;
    }

    public int getExperience() {
        System.out.print(this.name + "'s experience: ");
        return this.experience;
    }

    public int setSalary(int salary) {
        return this.salary = salary;
    }

    public int getSalary() {
        System.out.print(this.name + "'s salary: $");
        return this.salary;
    }

    public String toString() {
        return id + ": " + name + ", " + surname + ", " + specialization + ", " + experience + ", " + "$" + salary;
    }
}

