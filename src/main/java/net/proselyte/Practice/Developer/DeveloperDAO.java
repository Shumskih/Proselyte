package main.java.net.proselyte.Practice.Developer;

import java.io.*;
import java.util.ArrayList;
import java.util.NoSuchElementException;

class DeveloperDAO {

    private static final String filePath = "developer.txt";

    void save(Developer developer) {
        File file = new File("developer.txt");
        String id = Integer.toString(developer.getId());
        boolean IDExists = false;

        // Checking if file exists and if true searching ID duplicates
        if (file.exists()) {
            // Search of ID duplicates
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                String[] developerData;

                while ((line = reader.readLine()) != null) {
                    developerData = line.split(",");
                    if (developerData[0].equals(id)) {
                        System.out.println("==========================================================================");
                        System.out.println("Developer with ID " + id + " is already exists. Please, choose another ID.");
                        System.out.println("==========================================================================");
                        System.out.println();
                        IDExists = true;
                        break;
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found, sorry..." + e);
            } catch (NoSuchElementException e) {
                System.out.println("There is no developer with id: " + id + ": " + e);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // End of searching of ID duplicates


        // Writing developer to a file
        if (!IDExists) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
                String str = developer.getId() + "," + developer.getName() + "," + developer.getSurname() +
                        "," + developer.getSpecialization() + "," + developer.getExperience() + "," + developer.getSalary();
                writer.write(str);
                writer.newLine();
                writer.flush();
                writer.close();
                System.out.println("Developer " + developer.getName() + " with ID " + id + " created.");
            } catch (IOException e) {
                System.out.println("I can't to save file " + filePath + ", sorry...: " + e);
            }
        }
        // End of writing developer to a file
    }

    void update(Developer developer) {
        File file = new File("developer.txt");
        String idToString = Integer.toString(developer.getId());
        ArrayList<String> developersList = new ArrayList<>();
        ArrayList<String> changedDeveloper = new ArrayList<>();
        boolean IDExists = false;
        // Checking if file exists and if true searching of ID
        if (file.exists()) {
            // Searching of ID
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                String[] developerData;

                while ((line = reader.readLine()) != null) {
                    developerData = line.split(",");
                    if (developerData[0].equals(idToString)) {
                        IDExists = true;

                        developerData[0] = Integer.toString(developer.getId());
                        developerData[1] = developer.getName();
                        developerData[2] = developer.getSurname();
                        developerData[3] = developer.getSpecialization();
                        developerData[4] = Integer.toString(developer.getExperience());
                        developerData[5] = Integer.toString(developer.getSalary());

                        String str = developerData[0] + "," +
                                developerData[1] + "," +
                                developerData[2] + "," +
                                developerData[3] + "," +
                                developerData[4] + "," +
                                developerData[5];
                        System.out.println("Done!");
                        changedDeveloper.add(str);
                        for (String s : changedDeveloper)
                            System.out.println(s);
                    }
                    if (!developerData[0].equals(idToString)) {
                        developersList.add(line);
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found, sorry..." + e);
            } catch (NoSuchElementException e) {
                System.out.println("There is no developer with id: " + idToString + ": " + e);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else
            System.out.println("File not found.");
        // End of searching of ID

        // If ID exists
        if (IDExists) {
            file.delete();
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {

                for (String s : developersList) {
                        writer.write(s);
                        writer.newLine();
                    }
                for (String s : changedDeveloper) {
                    writer.write(s);
                    writer.newLine();
                }
                writer.flush();
                writer.close();
            } catch (IOException e) {
                System.out.println("I can't to save file " + filePath + ", sorry...: " + e);
            }
        } else {
            System.out.println("Developer not exists. Can't update");
        }
    }

    void remove(int id) {
        File file = new File("developer.txt");
        String idToString = Integer.toString(id);
        ArrayList<String> developersList = new ArrayList<>();
        boolean IDExists = false;
        // Checking if file exists and if true searching of ID
        if (file.exists()) {
            // Searching of ID
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                String[] developerData;

                while ((line = reader.readLine()) != null) {
                    developerData = line.split(",");
                    if (developerData[0].equals(idToString))
                        IDExists = true;
                    if (!developerData[0].equals(idToString)) {
                        developersList.add(line);
                    }
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found, sorry..." + e);
            } catch (NoSuchElementException e) {
                System.out.println("There is no developer with id: " + idToString + ": " + e);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else
            System.out.println("File not found.");
        // End of searching of ID

        // If ID exists
        if (IDExists) {
            file.delete();
            for (String s : developersList)
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
                    writer.write(s);
                    writer.newLine();
                    writer.flush();
                    writer.close();
                } catch (IOException e) {
                    System.out.println("I can't to save file " + filePath + ", sorry...: " + e);
                }
            System.out.println("Developer with ID " + id + " removed");
        } else
            System.out.println("Developer with ID " + id + " is not exists");
    }

    Developer getById(int id) {

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath)))
        {
            String intIdToString = Integer.toString(id);
            String line;
            String[] developer = null;

            while ((line = reader.readLine()) != null) {
                developer = line.split(",");
                if (developer[0].equals(intIdToString)) {
                    System.out.println("================");
                    System.out.println("Developer found: ");
                    System.out.println("================");
                    System.out.println();
                    System.out.println("ID: " + developer[0]);
                    System.out.println("Name: " + developer[1]);
                    System.out.println("Surname: " + developer[2]);
                    System.out.println("Specialization: " + developer[3]);
                    System.out.println("Experience: " + developer[4] + " year");
                    System.out.println("Salary: $" + developer[5]);
                    break;
                } else
                    developer = null;
            }
            if (developer == null)
                System.out.println("Developer with ID " + id + " not found. Please, try again later. )))");
        } catch (FileNotFoundException e) {
            System.out.println("File not found, sorry..." + e);
        } catch (NoSuchElementException e) {
            System.out.println("There is no developer with id: " + id + ": " + e);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
