package main.java.net.proselyte.chapter07;

// В данном примере конструкторы определяются в классе Box для инициализации размеров параллелепипеда тремя разными способами
class Box {
    double width;
    double height;
    double depth;

    // Конструктор, используемый при указании всех параметров
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Конструктор, используемый, когда ни один из параметров не указан
    Box() {
        width = -1; // -1 используется для обозначения неинициализированного параллелепипеда
        height = -1;
        depth = -1;
    }

    // Конструктор, используемый при создании куба
    Box(double len) {
        width = height = depth = len;
    }

    // Рассчитать и возвратить объём
    double volume() {
        return width * height * depth;
    }
}

class OverloadCons {
    public static void main (String args[]) {
        // Создаём параллелепипеды, используя разные конструкторы
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box();
        Box myCube = new Box(7);

        double vol;

        // Получить объём первого параллелепипеда
        vol = myBox1.volume();
        System.out.println("Объём первого параллелепипеда = " + vol);

        // Получить объём второго параллелепипеда
        vol = myBox2.volume();
        System.out.println("Объём второго параллелепипеда = " + vol);

        // Получить объём куба
        vol = myCube.volume();
        System.out.println("Объём куба = " + vol);
    }
}
