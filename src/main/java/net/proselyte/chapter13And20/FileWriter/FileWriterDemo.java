package main.java.net.proselyte.chapter13And20.FileWriter;

// Применение класса FileWriter

import java.io.*;

public class FileWriterDemo {
    public static void main (String args[]) throws IOException {
        String source = "Now is the time for all good men\n" +
                " to come to the aid of their country\n" +
                " and рау their due taxes." ;
        char buffer[] = new char[source.length()];
        source.getChars(0, source.length(), buffer, 0);

        try ( FileWriter f1 = new FileWriter("file1.txt");
              FileWriter f2 = new FileWriter("file2.txt");
              FileWriter f3 = new FileWriter("file3.txt") )
        {
            //Выводим символы в первый файл
            for (int i = 0; i < buffer.length; i += 2)
                f1.write(buffer[i]);

            // Выводим символы во второй файл
            f2.write(buffer);

            // Выводим символы в третий файл
            f3.write(buffer, buffer.length - buffer.length/4, buffer.length/4);
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        }
    }
}
