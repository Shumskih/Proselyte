package main.java.net.proselyte.Practice.javacorefinal;

import java.io.*;
import java.util.LinkedHashSet;
import java.util.Set;

public class ProjectView {
    private static final String filePathDevelopers = "developers.txt";

    ProjectController projectController = new ProjectController();
    ProjectDAO projectDAO = new ProjectDAO();
    DeveloperDAO developerDAO = new DeveloperDAO();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    Project project;
    Integer projectId;
    String projectName;
    String projectVersion;
    Set<Project> projects = new LinkedHashSet<>();
    Set<Skill> skills = new LinkedHashSet<>();
    Set<Developer> developers = new LinkedHashSet<>();
    Integer developerId;

    public void createProject() {
        String addDeveloper;
        try {
            do {
                System.out.println("Enter project's ID: ");
                projectId = Integer.parseInt(br.readLine().trim());
                break;
            } while (true);

            do {
                System.out.println("Enter project's name: ");
                projectName = br.readLine().trim();
                break;
            } while (true);

            do {
                System.out.println("Enter project's version: ");
                projectVersion = br.readLine().trim();

                System.out.println("Add developer to the project? \"yes\" or \"no\"");
                addDeveloper = br.readLine().trim();
                if (addDeveloper.equals("yes")) {

                    System.out.println("There is a list of developers: ");

                    developerDAO.showAllDevelopers();

                    System.out.println();
                    System.out.println("Please, enter ID of developer you want to add: ");
                    developerId = Integer.parseInt(br.readLine().trim());

                    try (BufferedReader reader = new BufferedReader(new FileReader(filePathDevelopers)))
                    {
                        String line;
                        String[] developerData;
                        Set<Developer> developers = new LinkedHashSet<>();

                        Integer id;
                        String developerName;
                        String developerSurname;
                        String developerSpecialization;
                        Integer developerExperience;
                        Integer developerSalary;

                        while((line = reader.readLine()) != null) {
                            developerData = line.split(",");

                            if (developerData[0].equals(Integer.toString(developerId))) {

                                id = Integer.parseInt(developerData[0]);
                                developerName = developerData[1];
                                developerSurname = developerData[2];
                                developerSpecialization = developerData[3];
                                developerExperience = Integer.parseInt(developerData[4]);
                                developerSalary = Integer.parseInt(developerData[5]);

                                Developer developer = new Developer(id, developerName, developerSurname, developerSpecialization, developerExperience, developerSalary, skills, projects);
                                developers.add(developer);
                                developer = null;
                            }
                        }
                        project = new Project(projectId, projectName, projectVersion, developers);
                        projectDAO.save(project);
                        break;

                    } catch (FileNotFoundException e) {
                        System.out.println("File: " + filePathDevelopers + " not found." + e);
                    } catch (IOException e){
                        System.out.println("Ooooops... Some error happened: " + e);
                    }
                } else {
                    Set<Developer> developers = new LinkedHashSet<>();
                    project = new Project(projectId, projectName, projectVersion, developers);
                    projectDAO.save(project);
                    projects.add(project);
                    break;
                }
                break;
            } while (true);


        } catch (IOException e) {
            System.out.println("Ooooops... Some error happened: " + e);
        }
    }

    public void updateProject() {
        String addDeveloper;
        try {
            do {
                System.out.println("Enter project's ID: ");
                projectId = Integer.parseInt(br.readLine().trim());
                break;
            } while (true);

            do {
                System.out.println("Enter project's name: ");
                projectName = br.readLine().trim();
                break;
            } while (true);

            do {
                System.out.println("Enter project's version: ");
                projectVersion = br.readLine().trim();
                break;
            } while (true);

            do {
                System.out.println("There is a list of developers: ");

                developerDAO.showAllDevelopers();

                System.out.println();
                System.out.println("Please, enter ID of developer you want to add: ");
                developerId = Integer.parseInt(br.readLine().trim());

                try (BufferedReader reader = new BufferedReader(new FileReader(filePathDevelopers)))
                {
                    String line;
                    String[] developerData;

                    Integer id;
                    String developerName;
                    String developerSurname;
                    String developerSpecialization;
                    Integer developerExperience;
                    Integer developerSalary;

                    while((line = reader.readLine()) != null) {
                        developerData = line.split(",");

                        if (developerData[0].equals(Integer.toString(developerId))) {

                            id = Integer.parseInt(developerData[0]);
                            developerName = developerData[1];
                            developerSurname = developerData[2];
                            developerSpecialization = developerData[3];
                            developerExperience = Integer.parseInt(developerData[4]);
                            developerSalary = Integer.parseInt(developerData[5]);

                            Developer developer = new Developer(id, developerName, developerSurname, developerSpecialization, developerExperience, developerSalary, skills, projects);
                            developers.add(developer);
                            developer = null;
                        }
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("File: " + filePathDevelopers + " not found." + e);
                } catch (IOException e){
                    System.out.println("Ooooops... Some error happened: " + e);
                }

                System.out.println("Do you want to add another one developer? yes or no: ");
                addDeveloper = br.readLine().trim();
                if (addDeveloper.equals("no")) {
                    project = new Project(projectId, projectName, projectVersion, developers);
                    projectDAO.update(project);
                    break;
                }
            } while(true);
        } catch (IOException e) {
            System.out.println("Ooooops... Some error happened: " + e);
        }
    }

    public void getById() {
        try {
            System.out.println("Enter ID of project you want to find: ");
            projectId = Integer.parseInt(br.readLine().trim());
            projectController.getById(projectId);
        } catch (IOException e) {
            System.out.println("Ooooops... Some error happened: " + e);
        }
    }

    public void showAllProjects() {
        projectController.showAllProjects();
    }
}
