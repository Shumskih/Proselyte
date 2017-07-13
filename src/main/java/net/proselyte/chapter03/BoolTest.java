package main.java.net.proselyte.chapter03;

// Test of type boolean
class BoolTest {
    public static void main (String[] args) {
        boolean b;

        b = false;
        System.out.println("b равно " + b);
        b = true;
        System.out.println("b равно " + b);

        // A boolean value can control the if statement
        if(b) System.out.println("Этот код выполняется");
        b = false;
        if(b) System.out.println("Этот код не выполняется");

        // Comparison result - value of boolean type
        System.out.println("10 > 9 равно " + (10 > 9));
    }
}
