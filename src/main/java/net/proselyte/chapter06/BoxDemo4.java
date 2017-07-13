package main.java.net.proselyte.chapter06;

// Теперь метод volume() возвращает объём параллелепипеда
class Box1 {
    double width;
    double height;
    double depth;

    // Рассчитать и возвратить объмём
    double volume() {
        return width * height * depth;
    }
}

class BoxDemo4 {
    public static void main (String args[]) {
        Box1 myBox1 = new Box1();
        Box1 myBox2 = new Box1();
        double vol;

        // Присваиваем значения переменным экземпляра myBox1
        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        // Присваиваем другие значения переменным экземпляра myBox2
        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        // Получаем объём первого параллелепипеда
        vol = myBox1.volume();
        System.out.println("Объём первого параллелепипеда равен: " + vol);

        // Получаем объём второго праллелепипеда
        vol = myBox2.volume();
        System.out.println("Объём второго параллелепипеда равен: " + vol);
    }
}