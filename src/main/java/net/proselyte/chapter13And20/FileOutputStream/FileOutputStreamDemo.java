package main.java.net.proselyte.chapter13And20.FileOutputStream;

// Демонстрация применения класса FileOutputStream.
// В этой программе используется традиционный способ закрытия файла

import java.io.*;

public class FileOutputStreamDemo {
    public static void main (String args[]) {

        String source = "Now is the time for all good men\n" +
                " to come to the aid of their country\n" +
                " and pay they due taxes";
        byte buf[] = source.getBytes();
        FileOutputStream f0 = null;
        FileOutputStream f1 = null;
        FileOutputStream f2 = null;

        try {
            f0 = new FileOutputStream("file1.txt");
            f1 = new FileOutputStream("file2.txt");
            f2 = new FileOutputStream("file3.txt");

            // Записываем данные в первый файл
            for (int i = 0; i < buf.length; i += 2) f0.write(buf[i]);

            // Записываем данные во второй файл
            f1.write(buf);

            // Записываем данные в третий файл
            f2.write(buf, buf.length - buf.length/4, buf.length/4);
        } catch (IOException e) {
            System.out.println("произошла ошибка ввода-вывода");
        } finally {

            try {
                if(f0 != null) f0.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла file1.txt");
            }

            try {
                if(f1 != null) f1.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла file2.txt");
            }

            try {
                if(f2 != null) f2.close();
            } catch (IOException e) {
                System.out.println("ошибка закрытия файла file3.txt");
            }
        }
    }
}

