package main.java.net.proselyte.chapter06;

// В данном примере программы для инциализации размеров параллелепипеда в классе Box применяется конструктор
class Box6 {
    double width;
    double height;
    double depth;

    // Это конструктор класса Box
    Box6() {
        width = 10;
        height = 10;
        depth = 10;
    }

    // Рассчитать и возвратить объём
    double volume() {
        return width * height * depth;
    }
}



class BoxDemo6 {
    public static void main (String args[]) {
        // Объявляем, выделяем память и инициализируем объекты типа Box
        Box6 myBox1 = new Box6();
        Box6 myBox2 = new Box6();
        double vol;

        // Получаем объём первого параллелепипеда
        vol = myBox1.volume();
        System.out.println("Объём первого параллелепипеда = " + vol);

        // Получаем объём второго параллелепипеда
        vol = myBox2.volume();
        System.out.println("Объём второго параллелепипеда = " + vol);
    }
}
