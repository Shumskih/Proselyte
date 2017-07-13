package main.java.net.proselyte.chapter07;

// В этой версии класса Box один объект допускается инициализировать другим объектом
class Box1 {
    double width;
    double height;
    double depth;

    // В этом конструкторе в качестве параметра используется объект типа Box
    Box1(Box1 ob) { // Передаём объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // Конструктор, используемый при указании всех параметров
    Box1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Конструктор, используемый, если ни один из размеров не указан
    Box1() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // Конструктор для создания куба
    Box1(double len) {
        width = height = depth = len;
    }

    // Рассчитать и возвратить объём
    double volume() {
        return width * height * depth;
    }
}


class OverloadCons2 {
    public static void main (String args[]) {
        Box1 myBox1 = new Box1(10, 20, 15);
        Box1 myBox2 = new Box1();
        Box1 myBox3 = new Box1(7);

        // Создаём копию объекта myBox1
        Box1 myClone = new Box1(myBox1);

        double vol;

        // Получаем объём первого параллелепипеда
        vol = myBox1.volume();
        System.out.println("Объём первого параллелепипеда = " + vol);

        // Получаем объём второго параллелепипеда
        vol = myBox2.volume();
        System.out.println("Объём второго параллелепипеда = " + vol);

        // Получаем объём куба
        vol = myBox3.volume();
        System.out.println("Объём куба = " + vol);

        // Получаем объём клона
        vol = myClone.volume();
        System.out.println("Объём клона = " + vol);
    }
}
