package main.java.net.proselyte.chapter13And20;

/*
    Отображение содержимого текстового файла.
    Чтобы воспользоваться этой программой, укажите имя файла, который требуется просмотреть.
    Например, чтобы просмотреть файл TEXT.TXT, введите в командной строке слуедующую команду:

    java ShowFile TEXT.TXT
*/

import java.io.*;

public class ShowFile {
    public static void main (String args[]) {
        int i;
        FileInputStream fin;

        // Сначала убедимся, что имя файла указано
        if(args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }

        // Пытаемся открыть файл
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Невозможно открыть файл");
            return;
        }

        // Теперь файл открыт и готов к чтению. Далее из него читются символы до тех пор, пока не встретится признак конца файла
        try {
            do {
                i = fin.read();
                if(i != -1)
                    System.out.print((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Ошибка чтения файла");
        }

        // Закрыть файл
        try {
            fin.close();
        } catch (IOException e) {
            System.out.println("Ошибка закрытия файла");
        }

    }
}

