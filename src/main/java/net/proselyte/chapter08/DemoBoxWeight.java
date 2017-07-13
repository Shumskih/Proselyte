package main.java.net.proselyte.chapter08;

// Здесь наследование применяется для расширения класса Box
class Box {
    double width;
    double height;
    double depth;

    // Конструируем клон объекта
    Box(Box obj) {
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    // Конструктор, применяемый при указании всех размеров
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Конструктор, применяемый при отсутствии размеров
    Box() {
        width = -1;
        height = -1;
        depth = -1; // Значение -1 служит для обозначения неинициализированного параллелепипеда
    }

    // Конструктор, применяемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    // Рассчитать и возвратить объём
    double volume() {
        return width * height * depth;
    }
}

//Расширяем класс Box включением в него поле веса
class BoxWeight extends Box {
    double weight; // Вес параллелепипеда

    // Конструктор BoxWeight
    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

class DemoBoxWeight {
    public static void main (String args[]) {

        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
        double vol;

        vol = myBox1.volume();
        System.out.println("Объём myBox1 = " + vol);
        System.out.println("Вес myBox1 = " + myBox1.weight);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("Объём myBox2 = " + vol);
        System.out.println("Вес myBox2 = " + myBox2.weight);
    }
}
