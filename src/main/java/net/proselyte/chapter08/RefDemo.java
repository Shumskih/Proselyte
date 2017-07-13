package main.java.net.proselyte.chapter08;

// Переменная суперкласса может ссылаться на объект подкласса
class RefDemo {
    public static void main (String args[]) {
        BoxWeight weightBox = new BoxWeight(3, 5, 7, 8.37);
        Box plainBox = new Box();
        double vol;

        vol = weightBox.volume();
        System.out.println("Объём weightBox = " + vol);
        System.out.println("Вес weightBox = " + weightBox.weight);
        System.out.println();

        // Присвоить ссЫлке на объект BoxWeight ссылки на объект Box
        plainBox = weightBox;
        vol = plainBox.volume(); // Верно, т.к. метод volume определён в классе Box
        System.out.println("Объём plainBox = " + vol);

        // Следующий оператор ошибочен, поскольку член plainBox не определяет член weight
        // System.out.println("Вес plainBox = " + plainBox.weight);
    }
}
