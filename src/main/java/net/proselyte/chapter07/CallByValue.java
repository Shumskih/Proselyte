package main.java.net.proselyte.chapter07;

// Аргументы примитивных типов передаются по значению
class Test1 {
    void meth(int i, int j) {
        i *= 2;
        j /=2;
    }
}

class CallByValue {
    public static void main (String args[]) {
        Test1 ob = new Test1();
        int a = 15, b = 20;

        System.out.println("a и b до вызова: а = " + a + ", b = " + b + ";");

        ob.meth(a, b);

        System.out.println("a и b после вызова: a = " + a + ", b = " + b + ";");
    }
}
