package main.java.net.proselyte.chapter06;

// В этой программе применяется метод с параметрами
class Box5 {
    double width;
    double height;
    double depth;

    // Рассчитать и возвратить объём
    double volume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

class BoxDemo5 {
    public static void main (String args[]) {
        Box5 myBox1 = new Box5();
        Box5 myBox2 = new Box5();
        double vol;

        // Инициализируем каждый экземпляр класса Box
        myBox1.setDim(10, 20, 15);
        myBox2.setDim(3, 6, 9);

        // Получаем объём первого параллелепипеда
        vol = myBox1.volume();
        System.out.println("Объём первого параллелепипеда = " + vol);

        // Получаем объём второго параллелепипеда
        vol = myBox2.volume();
        System.out.println("Объём второго параллелепипеда = " + vol);
    }
}
