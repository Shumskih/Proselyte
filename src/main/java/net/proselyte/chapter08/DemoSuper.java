package main.java.net.proselyte.chapter08;

// Теперь в классе BoxWeight ключевое слово super используется для инициализации собственных свойств объекта типа Box
class Box1 {
    private double width;
    private double height;
    private double depth;

    // Конструируем клон объекта
    Box1(Box1 obj) {
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    // Конструктор, применяемый при указании всех размеров
    Box1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Конструктор, применяемый при отсутствии размеров
    Box1() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // Конструктор, применяемый при создании куба
    Box1(double len) {
        width = height = depth = len;
    }

    // Рассчитываем и возвращаем объём
    double volume() {
        return width * height * depth;
    }
}

// Теперь в классе WeightBox полностью реализованы все конструкторы
class BoxWeight1 extends Box1 {
    double weight; // Вес параллелепипеда

    // Сконструировать клон объекта
    BoxWeight1(BoxWeight1 obj) { // Передать объект конструктору
        super(obj);
        weight = obj.weight;
    }

    // Конструктор, применяемый при указании всех размеров
    BoxWeight1(double w, double h, double d, double m) {
        super(w, h, d); // Вызвать конструктор из суперкласса
        weight = m;
    }

    // Конструктор, применяемый по умолчанию
    BoxWeight1() {
        super();
        weight = -1;
    }

    // Конструктор, применяемый при создании куба
    BoxWeight1(double len, double m) {
        super(len);
        weight = m;
    }
}

class DemoSuper {
    public static void main (String args[]) {
        BoxWeight1 myBox1 = new BoxWeight1(10, 20, 15, 34.3);
        BoxWeight1 myBox2 = new BoxWeight1(2, 3, 4, 0.076);
        BoxWeight1 myBox3 = new BoxWeight1(); // По умолчанию
        BoxWeight1 myCube = new BoxWeight1(3, 2);
        BoxWeight1 myClone = new BoxWeight1(myBox1);
        double vol;

        vol = myBox1.volume();
        System.out.println("Объём myBox1 = " + vol);
        System.out.println("Вес myBox1 = " + myBox1.weight);
        System.out.println();

        vol = myBox2.volume();
        System.out.println("Объём myBox2 = " + vol);
        System.out.println("Вес myBox2 = " + myBox2.weight);
        System.out.println();

        vol = myBox3.volume();
        System.out.println("Объём myBox3 = " + vol);
        System.out.println("Вес myBox3 = " + myBox3.weight);
        System.out.println();

        vol = myClone.volume();
        System.out.println("Объём myClone = " + vol);
        System.out.println("Вес myClone = " + myClone.weight);
        System.out.println();

        vol = myCube.volume();
        System.out.println("Объём myCube = " + vol);
        System.out.println("Вес myCube = " + myCube.weight);
        System.out.println();
    }
}
