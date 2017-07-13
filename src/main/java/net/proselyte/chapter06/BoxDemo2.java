package main.java.net.proselyte.chapter06;

// Объявляются два объекта класса Box
class BoxDemo2 {
    public static void main (String args[]) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        // Присваиваем значения переменным экземпляра myBox1
        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        // Присваиваем другие значения переменным экземпляра myBox2
        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        // Рассчитываем объём первого параллелепипеда
        vol = myBox1.width * myBox1.height * myBox1.depth;
        System.out.println("Объём равен: " + vol);

        //Рассчитываем объём второго параллелепипеда
        vol = myBox2.width * myBox2.height * myBox2.depth;
        System.out.println("Объём равен: " + vol);
    }
}
