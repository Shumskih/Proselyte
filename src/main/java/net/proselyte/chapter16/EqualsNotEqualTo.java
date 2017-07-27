package main.java.net.proselyte.chapter16;

// Метод equals() в сравнении с операцией ==
class EqualsNotEqualTo {
    public static void main (String args[]) {
        String s1 = "Привет";
        String s2 = new String(s1);

        System.out.println(s1 + " равно " + s2 + " -> " + s1.equals(s2));

        System.out.println(s1 + " == " + s2 + " -> " + (s1 == s2));
    }
}
