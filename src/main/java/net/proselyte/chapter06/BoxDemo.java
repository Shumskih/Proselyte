package main.java.net.proselyte.chapter06;

class Box {
    double width;
    double height;
    double depth;

    // ввывести объём параллелепипеда
    void volume() {
        System.out.print("Объём равен ");
        System.out.println(width * height * depth);
    }
}

class BoxDemo {
    public static void main (String args[]) {
        Box myBox = new Box();

        double vol;
        // Присвоить значение переменным экземпляра myBox
        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;

        // Рассчитать объём параллелепипеда
        vol = myBox.width * myBox.height * myBox.depth;
        System.out.println("Объём равен: " + vol);

    }
}
