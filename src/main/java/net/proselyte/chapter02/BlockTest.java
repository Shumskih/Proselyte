package main.java.net.proselyte.chapter02;

class BlockTest {
    public static void main (String[] args) {
        int x, y;

        y = 20;

        for ( x = 0; x < 10; x++) {
            System.out.println("Значение x: " + x);
            System.out.println("Значeние y: " + y);
            y = y - 2;
        }
    }
}
