package main.java.net.proselyte.chapter16.StringBuffer;

// Применение методов charAt() и setCharAt()
class setCharAtDemo {
    public static void main (String args[]) {
        StringBuffer sb = new StringBuffer("Hello!");
        System.out.println("Буфер до = " + sb);
        System.out.println("До вызова charAt(1) = " + sb.charAt(1));
        sb.setCharAt(1, 'i');
        sb.setLength(2);
        System.out.println("Буфер после = " + sb);
        System.out.println("После вызова charAt(1) = " + sb.charAt(1));
    }
}
