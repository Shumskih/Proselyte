package main.java.net.proselyte.chapter06;

// В данном примере программы для инициализации разморов параллелепипеда в классе Box применяется параметризированный конструктор
class Box7 {
    double width;
    double height;
    double depth;

    // Конструктор класса Box
    Box7(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Рассчитываем и возвращаем объём
    double volume() {
        return width * height * depth;
    }
}


class BoxDemo7 {
    public static void main (String args[]) {
        // Объявляем, выделяем память и инициализируем объекты типа Box
        Box7 myBox1 = new Box7(10, 20, 15);
        Box7 myBox2 = new Box7(3, 6, 9);
        double vol;

        // Получаем объём первого параллелепипеда
        vol = myBox1.volume();
        System.out.println("Объём первого параллелепипеда = " + vol);

        // Получаем объём второго параллелепипеда
        vol = myBox2.volume();
        System.out.println("Объём второго параллелепипеда = " + vol);
    }
}
