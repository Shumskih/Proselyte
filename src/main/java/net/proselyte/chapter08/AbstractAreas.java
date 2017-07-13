package main.java.net.proselyte.chapter08;

// Применение абстрактных методов и классов
abstract class Figure1 {
    double dim1;
    double dim2;

    Figure1(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    // Теперь метод area() объявляется абстрактным
    abstract double area();
}

class Rectangle1 extends Figure1 {
    Rectangle1(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("В области четырёхугольника");
        return dim1 * dim2;
    }
}

class Triangle1 extends Figure1 {
    Triangle1(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("В области треугольника");
        return dim1 * dim2 / 2;
    }
}
class AbstractAreas {
    public static void main (String args[]) {
        // Figure1 f = new Figure1(10, 10); // Теперь недопустимо
        Rectangle1 r = new Rectangle1(9, 5);
        Triangle1 t = new Triangle1(10, 8);
        Figure1 figref; // Верно, но объект не создаётся

        figref = r;
        System.out.println("Площадь четырёхугольника = " + figref.area());

        figref = t;
        System.out.println("Площадь треугольника = " + figref.area());
    }
}
