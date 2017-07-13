package main.java.net.proselyte.chapter07;

// Внутренний класс в цикле for
class Outer2 {
    int outer_x = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner {
                void display() {
                    System.out.println("outer_x = " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}
class InnerClassDemo2 {
    public static void main (String args[]) {
        Outer outer = new Outer();
        outer.test();
    }
}
