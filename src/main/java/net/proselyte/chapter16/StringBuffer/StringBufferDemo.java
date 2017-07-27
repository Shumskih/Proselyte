package main.java.net.proselyte.chapter16.StringBuffer;

// Методы length() и capacity() из класса StringBuffer
class StringBufferDemo {
    public static void main (String args[]) {
        StringBuffer sb = new StringBuffer("Hello!");
        System.out.println("буфер = " + sb);
        System.out.println("длина = " + sb.length());
        System.out.println("ёмкость = " + sb.capacity());
    }
}
