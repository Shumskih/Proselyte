package main.java.net.proselyte.Practice.Developer;

import java.io.*;
import java.util.ArrayList;

public class DeveloperDAO {

    public void saveFile(ArrayList developers) {
        try ( ObjectOutputStream saveFile = new ObjectOutputStream(new FileOutputStream("developers.txt")) ){

            saveFile.writeObject(developers);

        } catch (IOException e) {
            System.out.println("Не могу сохранить файл: " + e);
        }
    }

    public void openFile() {
        try ( ObjectInputStream openFile = new ObjectInputStream(new FileInputStream("developers.txt")) ) {

            ArrayList<Developer> developers2 = (ArrayList<Developer>) openFile.readObject();
            System.out.println(developers2.toString());

        } catch (ClassNotFoundException e) {
            System.out.println("Файл не найден: " + e);
        } catch (IOException e) {
            System.out.println("При открытии файла произошла ошибка: " + e);
        }
    }

}
