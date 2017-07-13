package main.java.net.proselyte.chapter08;

// Расширение класса BoxWeight включением в него стоимости доставки
class Box2 {
    private double width;
    private double height;
    private double depth;

    // Сконструировать клон объекта
    Box2(Box2 obj) {
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    // Конструктор, применяемый при указании всех размеров
    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // Конструктор, применяемый при отсутствии размеров
    Box2() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // Конструктор, применяемый при создании куба
    Box2(double len) {
        width = height = depth = len;
    }

    // Рассчитать и возвраьтьб объём
    double volume() {
        return width * height * depth;
    }
}

// Добавить поле веса
class BoxWeight2 extends Box2 {
    double weight; // Вес параллелепипеда

    // Сконструировать клон объекта
    BoxWeight2(BoxWeight2 obj) {
        super(obj);
        weight = obj.weight;
    }

    // Конструктор, применяемый при указании всех параметров
    BoxWeight2(double w, double h, double d, double m) {
        super(w, h, d); // Вызвать конструктор суперкласса
        weight = m;
    }

    // Конструктор, применяемый по умолчанию
    BoxWeight2() {
        super();
        weight = -1;
    }

    // Конструктор, применяемый при создании куба
    BoxWeight2(double len, double m) {
        super(len);
        weight = m;
    }
}

// Добавить поле стоимости доставки
class Shipment extends BoxWeight2 {
    double cost;

    // Сконструировать клон объекта
    Shipment(Shipment obj) {
        super(obj);
        cost = obj.cost;
    }

    // Конструктор, применяемый при указании всех параметров
    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    // Конструктор, применяемый по умолчанию
    Shipment() {
        super();
        cost = -1;
    }

    // Конструктор, применяемый при создании куба
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}
class DemoShipment {
    public static void main (String args[]) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;

        vol = shipment1.volume();
        System.out.println("Объём shipment1 = " + vol);
        System.out.println("Вес shipment1 = " + shipment1.weight);
        System.out.println("Стоимость доставки:  $" + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Объёи shipment2 = " + vol);
        System.out.println("Вес shipment2 = " + shipment2.weight);
        System.out.println("Стоимость доставки: $" + shipment2.cost);
        System.out.println();
    }
}
