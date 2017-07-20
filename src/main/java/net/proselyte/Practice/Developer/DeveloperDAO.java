package main.java.net.proselyte.Practice.Developer;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;


public class DeveloperDAO {

    public static final String filePath = "developer.txt";

    public void save(Developer developer) {
        try ( BufferedWriter writer = new BufferedWriter(new FileWriter(filePath)) )
        {
            String str = developer.getId() + ", " + developer.getName() + ", " + developer.getSurname() + ", " +
                         developer.getSpecialization() + ", " + developer.getExperience() + ", $" + developer.getSalary() + ";";

            writer.write(str);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println("I can't to save file " + filePath + ", sorry...");
        }
    }

    public Developer getById(int id) throws FileNotFoundException {
        String intIdToString = Integer.toString(id);

        File file = new File(filePath);

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] developerData = line.split(", ");

        scanner.close();

        if (developerData[0].equals(intIdToString))
            System.out.println(Arrays.toString(developerData));
        else
            System.out.println("Developer not found!");


        return null;
    }

}
