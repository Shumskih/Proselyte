package main.java.net.proselyte.chapter13And20.FileReader;

// Применение класса FileReaderDemo

import java.io.*;

public class FileReaderDemo {
    public static void main (String args[]) {

        try ( FileReader fr = new FileReader("/Projects/Java/ProselyteCorrected/src/main/java/net/proselyte/chapter13And20/FileReader/FileReaderDemo.java") )
        {
            int c;

            // Читаем и выводим содержимое файла
            while ((c = fr.read()) != -1) System.out.print((char) c);

        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}
