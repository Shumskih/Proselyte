package main.java.net.proselyte.chapter16.StringBuffer;

// Изменение порядка следования символов в объекте типа StringBuffer с помощью метода revers()
class reversDemo {
    public static void main (String args[]) {
        StringBuffer s = new StringBuffer("abcdef");

        System.out.println(s);
        s.reverse();
        System.out.println(s);
    }
}
