package main.java.net.proselyte.chapter13And20.FileInputStream;

// Демонстрация применения класса FileInputStream.
// В этой программе используется оператор try с ресурсами
// Требуется установка комплекта JDK, начиная с версии 7

import java.io.*;

public class FileInputStreamDemo {
    public static void main (String args[]) {
        int size;

        // Для автоматического закрытия потока ввода используется оператор try с ресурсами
        try (FileInputStream f = new FileInputStream("/Projects/Java/Proselyte/13. IO/src/FileInputStream/FileInputStreamDemo.java")){

            System.out.println("Общее количество доступных байтов: " + (size = f.available()));

            int n = size/40;
            System.out.println("Первые " + n + " байтов, " + "прочитанных из файла по очереди методом read()");
            for (int i = 0; i < n; i++) {
                System.out.print((char) f.read());
            }
            System.out.println("\nВсё ещё доступно:" + f.available());

            System.out.println("Чтение следующих " + n + " байтов по очереди методом read(b[])");

            byte b[] = new byte[n];
            if(f.read(b) != n)
                System.err.println("Нельзя прочитать " + n + " байтов.");

            System.out.println(new String(b, 0, n));
            System.out.println("Всё ещё доступно " + (size = f.available()));
            System.out.println("Пропустить половину оставшихся байтов методом skip()");

            f.skip(size/2);

            System.out.println("Всё ещё доступно: " + f.available());

            System.out.println("Чтение " + n/2 + " байтов, размещаемых в конце массива");
            if(f.read(b, n/2, n/2) != n/2)
                System.err.println("Нельзя прочитать " + n/2 + " байтов.");

            System.out.println(new String(b, 0, b.length));
            System.out.println("\nВсё ещё доступно: " + f.available());
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }
    }
}

