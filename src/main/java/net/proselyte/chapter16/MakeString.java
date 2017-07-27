package main.java.net.proselyte.chapter16;

// Создаём один объект типа String из другого
public class MakeString {
    public static void main (String args[]) {
        char[] c = { 'J', 'a', 'v', 'a' };
        String s1 = new String(c);
        String s2 = new String(s1);
        System.out.println(s1);
        System.out.println(s2);
    }
}
