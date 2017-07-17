package main.java.net.proselyte.Practice.Developer;

import java.io.*;

public class DeveloperDAO {

    public static final String filePath = "developer.txt";

    public void save(Developer developer) {

        try ( BufferedWriter writer = new BufferedWriter(new FileWriter(filePath)) )
        {
            String src = developer.toString();
            writer.write(src);
            writer.close();

        } catch (IOException e) {
            System.out.println("Ошибка сохранения файла");
        }
    }

}
