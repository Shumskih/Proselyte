package main.java.net.proselyte.chapter04;

// Сдвиг влево значения типа byte
class ByteShift {
    public static void main (String args[]) {
        int a = 64, b;
        int i;

        i = a << 2;
        b = (byte) (a << 2);

        System.out.println("Первоначальное значение a = " + a);
        System.out.println("i и b: " + i + " " + b);
    }
}
