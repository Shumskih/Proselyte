package main.java.net.proselyte.chapter18;

// Простая база данных тедефонных номеров, построенных на основе списков свойств
import java.io.*;
import java.util.*;

class Phonebook {
    public static void main (String[] args) throws IOException {
        Properties ht = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name, number;
        FileInputStream fin = null;
        boolean changed = false;

        // Пытаемся открыть файл phonebook.dat
        try {
            fin = new FileInputStream("phonebook.dat");
        } catch  (FileNotFoundException e){
            // Игнорировать отсутствующий файл
        }

        // Если телефонная книга существует, загрузить существующие номера
        try {
            if(fin!=null) {
                ht.load(fin);
                fin.close();
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
        }

        // Разрешить пользователю вводить новые имена и номера телефонов клиентов
        do {
            System.out.println("Введите имя" + " ('Выход' для звершения): ");
            name = br.readLine();
            if (name.equals("Выход")) continue;
            System.out.println("Введите номер: ");
            number = br.readLine();
            ht.put(name, number);
            changed = true;
        } while (!name.equals("Выход"));

        // Сохраняем телефонную книгу, если она изменилась
        if(changed) {
            FileOutputStream fout = new FileOutputStream("phonebook.dat");
            ht.store(fout, "Телефонная книга");
            fout.close();
        }

        // Ищем номер по имени абонента
        do {
            System.out.println("Введите имя для поиска " + " ('Выход' для завершения): ");
            name = br.readLine();
            if (name.equals("Выход")) continue;
            number = (String) ht.get(name);
            System.out.println(number);
        } while (!name.equals("Выход"));

    }
}
