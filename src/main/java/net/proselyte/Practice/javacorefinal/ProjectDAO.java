package main.java.net.proselyte.Practice.javacorefinal;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;

public class ProjectDAO {
    private static final String filePathProject = "projects.txt";

    public void save(Project project) {
        File projectFile = new File("projects.txt");
        String projectId = Integer.toString(project.getId());
        String projectName = project.getProjectName();
        boolean projectIdExists = false;

        // Checking if file exists and if true searching ID duplicates
        if (projectFile.exists()) {
            // Search of ID duplicates
            try (BufferedReader reader = new BufferedReader(new FileReader(filePathProject))) {
                String line;
                String[] projectData;

                while ((line = reader.readLine()) != null) {
                    projectData = line.split(",");
                    if (projectData[1].equals(projectName)) {
                        System.out.println("==========================================================================");
                        System.out.println("There is already a \"" + projectName + "\".Please, enter another name.");
                        System.out.println("==========================================================================");
                        System.out.println();
                        projectIdExists = true;
                        break;
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found, sorry..." + e);
            } catch (NoSuchElementException e) {
                System.out.println("There is no project with id: " + projectId + ": " + e);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // End of searching of ID duplicates

        // Writing project to a file
        if (!projectIdExists) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePathProject, true))) {
                String str = project.getId() + "," +
                            project.getProjectName() + "," +
                            project.getProjectVersion() + "," +
                            "<" +
                            project.getDevelopers() +
                            ">";
                writer.write(str);
                writer.newLine();
                writer.flush();
                writer.close();
                System.out.println("Project " + "\"" + project.getProjectName() + "\"" + " created.");
            } catch (IOException e) {
                System.out.println("I can't to save file " + filePathProject + ", sorry...: " + e);
            }
        }
        // End of write project to a file
    }

    void update(Project project) {
        File file = new File("projects.txt");
        String projectID = Integer.toString(project.getId());
        ArrayList<String> projectsList = new ArrayList<>();
        ArrayList<String> changedProject = new ArrayList<>();
        boolean IDExists = false;
        // Checking if file exists and if true searching of ID
        if (file.exists()) {
            // Searching of ID
            try (BufferedReader reader = new BufferedReader(new FileReader(filePathProject))) {
                String line;
                String[] projectData;
                String[] developerData;

                while ((line = reader.readLine()) != null) {
                    projectData = line.split(",");
                    developerData = line.split("[<>]");

                    if (projectData[0].equals(projectID)) {
                        IDExists = true;

//                        projectData[0] = Integer.toString(project.getId());
//                        projectData[1] = project.getProjectName();
//                        projectData[2] = project.getProjectVersion();

                        String str = project.getId() + "," +
                                    project.getProjectName() + "," +
                                    project.getProjectVersion() + "," +
                                    "<" +
                                    project.getDevelopers() +
                                    ">"
                        ;
                        System.out.println("Project Updated!");
                        changedProject.add(str);
                    }
                    if (!projectData[0].equals(projectID)) {
                        projectsList.add(line);
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + e);
            } catch (NoSuchElementException e) {
                System.out.println("There is no project with id: " + projectID + ": " + e);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else
            System.out.println("File not found.");
        // End of searching of ID

        // If ID exists
        if (IDExists) {
            file.delete();
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePathProject, true))) {

                for (String s : projectsList) {
                    writer.write(s);
                    writer.newLine();
                }
                for (String s : changedProject) {
                    writer.write(s);
                    writer.newLine();
                }
                writer.flush();
                writer.close();
            } catch (IOException e) {
                System.out.println("It can't to save file " + filePathProject + ": " + e);
            }
        } else {
            System.out.println("Project not exists. Can't update");
        }
    }

    public Integer getById(Integer id) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePathProject)))
        {
            String intIdToString = Integer.toString(id);
            String line;
            String[] project = null;

            while ((line = reader.readLine()) != null) {
                project = line.split(",");

                if (project[0].equals(intIdToString)) {
                    System.out.println("------------");
                    System.out.println("ID: \"" + project[0] + "\"" + " ");
                    System.out.println("Name: \"" + project[1] + "\"" + " ");
                    System.out.println("Version: \"" + project[2] + "\"" + " ");
                    System.out.println("------------");
                    break;
                } else {
                    project = null;
                }
            }
            if(project == null)
                System.out.println("Project with ID " + id + " not found. Please, try again later. )))");
        } catch(FileNotFoundException e){
            System.out.println("File projects.txt not found, sorry..." + e);
        } catch(NoSuchElementException e){
            System.out.println("There is no projects with id: " + id + ": " + e);
        } catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }

    public void getByIdDAO(Integer id) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePathProject)))
        {
            String intIdToString = Integer.toString(id);
            String line;
            String[] project = null;
            String[] parseProjectByAngleBrackets;

            while ((line = reader.readLine()) != null) {
                project = line.split(",");
                parseProjectByAngleBrackets = line.split("[<>]");
                String[] developersId = parseProjectByAngleBrackets[1].split(",");

                if (project[0].equals(intIdToString)) {
                    System.out.println("Project's ID: \"" + project[0] + "\"" + " ");
                    System.out.println("Project's name: \"" + project[1] + "\"" + " ");
                    System.out.println("Project's version: \"" + project[2] + "\"" + " ");

                    DeveloperDAO developerDAO = new DeveloperDAO();
                    for (String developerId:developersId) {
                        Integer index = Integer.parseInt(developerId);
                        developerDAO.getByIdDAO(index);
                    }
                    break;
                } else {
                    project = null;
                }
            }
            if(project == null)
                System.out.println("Project with ID " + id + " not found. Please, try again later. )))");
        } catch(FileNotFoundException e){
            System.out.println("File projects.txt not found, sorry..." + e);
        } catch(NoSuchElementException e){
            System.out.println("There is no projects with id: " + id + ": " + e);
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    public void showAllProjects() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePathProject))){
            String line;
            String[] projectString;
            Integer projectID;
            String projectName;
            String projectVersion;
            Set<Project> projects = new LinkedHashSet<>();
            Set<Developer> developers = new LinkedHashSet<>();

            while ((line = reader.readLine()) != null) {
                projectString = line.split(",");

                projectID = Integer.parseInt(projectString[0]);
                projectName = projectString[1];
                projectVersion = projectString[2];


                Project project = new Project(projectID, projectName, projectVersion, developers);
                projects.add(project);
                project = null;
            }

            for (Project p:projects) {
                System.out.println("------------");
                System.out.println("ID: " + p.getId());
                System.out.println("Name: " + p.getProjectName());
                System.out.println("Project Version: " + p.getProjectVersion());
            }

        } catch (FileNotFoundException e) {
            System.out.println("File projects.txt not found, sorry..." + e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
