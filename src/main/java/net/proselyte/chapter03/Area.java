package main.java.net.proselyte.chapter03;

// Calculating circle area
class Area {
    public static void main (String[] args) {
        double pi, r, a;

        r = 10.8; // Circle radius
        pi = 3.1416; // Approximate value of PI
        a = pi * r * r; // Calculating circle area

        System.out.println("Площадь круга равна " + a);
    }
}
