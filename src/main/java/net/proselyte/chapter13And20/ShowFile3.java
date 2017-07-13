package main.java.net.proselyte.chapter13And20;

/*
    В этой версии программы ShowFile оператор try с ресурсами применяется для автоматического закрытия файла
    Для выполнения этого кода требуется JDK версии 7
*/

import java.io.*;

public class ShowFile3 {
    public static void main (String args[]) {
        int i;

        // Сначала убедимся, что имя файла указано
        if(args.length != 1) {
            System.out.println("Использование: ShowFile имя_файла");
            return;
        }

        // Ниже оператор try с ресурсами применяется сначала для открытия, а затем для автоматического закрытия файла
        // по завершении блока этого оператора
        try (FileInputStream fin = new FileInputStream(args[0])) {

            do {
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            } while (i != -1);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода-вывода");
        }
    }
}

