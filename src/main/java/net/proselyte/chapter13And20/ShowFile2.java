package main.java.net.proselyte.chapter13And20;

/*
    Отображаем содержимое текстового файла.
    Чтобы воспользоваться этой программой, укажите имя файла, который требуется просмотреть.
    Например, чтобы просмотреть файл TEST.TXT, введите в командной строке следующую команду:

    java ShowFile TEST.TXT

    В этой варианте программы код, открывающий и получающий доступ к файлу, заключён в один блок оператора try.
    Файл закрывается в блоке оператора finally.
*/

import java.io.*;

public class ShowFile2 {
    public static void main (String args[]) {
        int i;
        FileInputStream fin = null;

        // Сначала убедимся, что имя файла указано
        if(args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }

        // В следующем коде сначала открывается файл, а затем из него читаются символы до тех пор, пока не встретится признак конца файла
        try {
            fin = new FileInputStream(args[0]);

            do {
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        } finally {
            // Закрываем файл в любом случае
            try {
                if(fin != null) fin.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла");
            }
        }
    }
}

