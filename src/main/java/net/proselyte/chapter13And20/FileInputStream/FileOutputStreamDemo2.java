package main.java.net.proselyte.chapter13And20.FileInputStream;

// Демонстрация применения класса FileOutputStream.
// Для закрытия файла в этой программе применяется файл try с ресурсами
// Требуется установка комплекта JDK, начиная с версии 7

import java.io.*;

public class FileOutputStreamDemo2 {
    public static void main (String args[]) {
        String source = "Now is the time for all good men\n" +
                " to come to the aid of their country\n" +
                " and pay they due taxes";
        byte buf[] = source.getBytes();

        // Применяем оператор try с ресурсами для закрытия файлов
        try (FileOutputStream f0 = new FileOutputStream("file1.txt");
             FileOutputStream f1 = new FileOutputStream("file2.txt");
             FileOutputStream f2 = new FileOutputStream("file3.txt")) {

            //Записать данные в первый файл
            for (int i = 0; i < buf.length; i += 2) f0.write(buf[i]);

            // Записать данные во второй файл
            f1.write(buf);

            // Записать данные в третий файл
            f2.write(buf, buf.length - buf.length/4, buf.length/4);
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода... beap... beap...");
        }

    }
}

