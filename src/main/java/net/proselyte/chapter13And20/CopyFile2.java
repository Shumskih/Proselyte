package main.java.net.proselyte.chapter13And20;

/*
    Версия программы CopyFile, использующая оператор try с сресурсами.
    Демонстрирует управление двумя ресурсами (в данном случае - файлами)
    в одном операторе try
*/

import java.io.*;

public class CopyFile2 {
    public static void main (String args[]) throws IOException {
        int i;

        // Убедимся, что заданы оба файла
        if(args.length != 2) {
            System.out.println("Использование: CopyFile откуда куда");
            return;
        }

        // Открываем два файла и управляем ими в операторе try
        try (FileInputStream fin = new FileInputStream(args[0]);
             FileOutputStream fout = new FileOutputStream(args[1])) {

            do {
                i = fin.read();
                if(i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Ошибка вода-вывода: " + e);
        }
    }
}

