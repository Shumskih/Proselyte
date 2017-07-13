package main.java.net.proselyte.chapter07;

// Демонстрация отличия модификаторов public и private
class Test4 {
    int a; // Доступ, определяемый по умолчанию
    public int b; // Открытый доступ
    private int c; // Закрытый доступ

    // Методы доступа к члену c данного класса
    void setC(int i) { // Установить значение члена с данного класса
        c = i;
    }

    int getC() { // Получить значение с данного класса
        return c;
    }
}
class AccessTest {
    public static void main (String args[]) {
        Test4 ob = new Test4();

        // Эти операторы правильны, поэтому члены a и b данного класса доступны непосредственно
        ob.a = 10;
        ob.b = 20;

        // Этот оператор неверен и может вызвать ошибку
        // ob.c = 100;  // Ошибка

        // Доступ к члену с данногго класса должен осуществляться с помощью методов его класса
        ob.setC(100); // Верно!
        System.out.println("a = " + ob.a + ", b = " + ob.b + ", c = " + ob.getC() + ";");
    }
}
