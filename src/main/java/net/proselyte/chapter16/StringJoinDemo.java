package main.java.net.proselyte.chapter16;

// Применение метода join(), определённого в классе String
class StringJoinDemo {
    public static void main (String args[]) {

        String result = String.join(" ", "Alpha", "Beta", "Gamma");
        System.out.println(result);

        result = String.join(", ", "John", "ID#: 569", "E-mail: John@ddfjdhf.com");
        System.out.println(result);
    }
}
