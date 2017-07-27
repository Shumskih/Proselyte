package main.java.net.proselyte.chapter16;

class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    public String toString() {
        return "Размеры " + width + " на " + depth + " на " + height + ".";
    }
}

public class toStringDemo {
    public static void main (String args[]) {
        Box b = new Box(10, 12, 14);
        String s = "Объект b типа Box " + b; // Выполняем сцепление символьной строки с объектом типа Box

        System.out.println(b); // Преобразуем объект типа Box в символьную строку при выводе

        System.out.println(s);
    }
}
