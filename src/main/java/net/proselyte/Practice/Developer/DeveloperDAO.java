package main.java.net.proselyte.Practice.Developer;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.NoSuchElementException;


public class DeveloperDAO {

    private static final String filePath = "developer.txt";
    private String str = null;

    public void save(Developer developer) {
        try ( BufferedWriter writer = new BufferedWriter(new FileWriter(filePath)) )
        {
            str = developer.getId() + "," + developer.getName() + "," + developer.getSurname() + "," +
                         developer.getSpecialization() + "," + developer.getExperience() + "," + developer.getSalary();
            writer.write(str);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println("I can't to save file " + filePath + ", sorry...");
        }
    }

    public void update(Developer developer) {
        try {
            //Recreate a file
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.flush();
            writer.close();

            // Developer
            str = developer.getId() + "," + developer.getName() + "," + developer.getSurname() + "," +
                    developer.getSpecialization() + "," + developer.getExperience() + "," + developer.getSalary();

            RandomAccessFile fileRead = new RandomAccessFile(filePath, "rw");
            long pos = 0;
            int b = fileRead.read();

            // Rewrite the developer in a file at position 0
            fileRead.seek(pos);
            fileRead.write(str.getBytes());
            fileRead.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        } catch (IOException e) {
            System.out.println("Some error: " + e);
        }
    }

    public void remove(int id) {
        try {
            String intIdToString = Integer.toString(id);
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] developerData = line.split(",");

            scanner.close();

            if (developerData[0].equals(intIdToString)) {
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
                    writer.flush();
                    writer.close();
                    System.out.println("Developer with id : " + id + " successfully deleted!");
                } catch (IOException e) {
                    System.out.println(e);
                }
            } else
                System.out.println("There is no developer with id: " + id);

        } catch (FileNotFoundException e) {
            System.out.println("File not found, sorry..." + e);
        } catch (NoSuchElementException e) {
            System.out.println("There is no developer with id: " + id);
        }
    }

    public Developer getById(int id) {

        try {
            String intIdToString = Integer.toString(id);

            File file = new File(filePath);

            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] developerData = line.split(",");

            scanner.close();

            if (developerData[0].equals(intIdToString))
                System.out.println(Arrays.toString(developerData));
            else
                System.out.println("There is no developer with id: " + id);

        } catch (FileNotFoundException e) {
            System.out.println("File not found, sorry..." + e);
        } catch (NoSuchElementException e) {
            System.out.println("There is no developer with id: " + id);
        }
        return null;
    }
}
