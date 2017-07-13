package main.java.net.proselyte.chapter13And20;

import java.io.*;

// Используем класс BufferedReader для чтения с консоли
class BRRead {
    public static void main (String args[]) throws IOException {

        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите символы, 'q' - для выхода");

        // Читаем символы
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
