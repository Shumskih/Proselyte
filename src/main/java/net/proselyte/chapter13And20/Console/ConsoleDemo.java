package main.java.net.proselyte.chapter13And20.Console;

// Применение класса Console

import java.io.*;

public class ConsoleDemo {
    public static void main (String args[]) {
        String str;
        Console con;

        // Получаем ссылку на консоль
        con = System.console();

        // Выходим из программы, если консоль недоступна
        if (con == null) return;

        // Читаем строку и выводим её
        str = con.readLine("Введите строку: ");
        con.printf("Введённая вами строка: %s\n", str);
    }
}
