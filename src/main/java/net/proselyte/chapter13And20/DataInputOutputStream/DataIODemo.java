package main.java.net.proselyte.chapter13And20.DataInputOutputStream;

// Применение классов DataInputStream и DataOutputStream

import java.io.*;

public class DataIODemo {
    public static void main (String args[]) {

        // Сначала выводим данные в файл
        try ( DataOutputStream dout = new DataOutputStream(new FileOutputStream("Test.dat")))
        {
            dout.writeDouble(98.6);
            dout.writeDouble(55.5);
            dout.writeInt(1000);
            dout.writeBoolean(true);
        } catch (FileNotFoundException e) {
            System.out.println("Нельзя открыть файл вывода");
            return;
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода: " + e);
        }

        // Теперь вводим данные из файла
        try ( DataInputStream din = new DataInputStream(new FileInputStream("Test.dat")))
        {
            double d = din.readDouble();
            double f = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();

            System.out.println("Получаемые значения: " + d + " " + i + " " + b + " " + f);
        } catch (FileNotFoundException e) {
            System.out.println("Нельзя открыть файл ввода: " + e);
            return;
        } catch (IOException e) {
            System.out.println("ошибка ввода-вывода: " + e);
        }
    }
}
