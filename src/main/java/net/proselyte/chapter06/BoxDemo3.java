package main.java.net.proselyte.chapter06;

// Применяется метод, введённый в класс Box
class BoxDemo3 {
    public static void main (String args[]) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        // Присваиваем значения переменным экземпляра myBox1
        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        // Присваиваем значения переменным экземпляра myBox2
        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        // Выводим объём первого параллелепипеда
        myBox1.volume();

        // Выводим объём второго параллелепипеда
        myBox2.volume();
    }
}
