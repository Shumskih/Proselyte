package main.java.net.proselyte.chapter13And20.PrintStream;

// Применение метода printf()

public class PrintfDemo {
    public static void main (String args[]) {
        System.out.println("Ниже приведениы некоторые числовые значения в разных форматах.\n");

        System.out.printf("Разные целочисленные форматы:");
        System.out.printf("%d %(d %+d %05d\n", 3, -3, 3, 3);

        System.out.println();
        System.out.printf("Формат чисел с плавающей точкой по умолчанию: %f\n", 1234567.123);
        System.out.printf("Формат чисел с плавающей точкой, разделяемых запятыми: %,f\n", 1234567.123);
        System.out.printf("Формат отрицательных чисел с плавающей точкой по умолчанию: %,f\n", -1234567.123);
        System.out.printf("Другой формат отрицательных чисел с плавающей точкой: %,(f\n", -1234567.123);

        System.out.println();

        System.out.printf("Выравнивание положительных и отрицательных числовых значений:");
        System.out.printf("% ,.2f\n% ,.2f\n", 1234567.123, -1234567.123);
    }
}

