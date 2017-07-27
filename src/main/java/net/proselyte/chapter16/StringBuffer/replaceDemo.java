package main.java.net.proselyte.chapter16.StringBuffer;

// Применение метода replace()
class replaceDemo {
    public static void main (String args[]) {
        StringBuffer sb = new StringBuffer("Это простой текст");

        sb.replace(4, 11, "был");
        System.out.println("После замены: " + sb);
    }
}
