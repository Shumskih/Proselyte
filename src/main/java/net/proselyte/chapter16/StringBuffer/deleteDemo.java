package main.java.net.proselyte.chapter16.StringBuffer;

// Применение методов delete() и deleteCharAt()
class deleteDemo {
    public static void main (String args[]) {
        StringBuffer sb = new StringBuffer("Это простой текст.");

        sb.delete(3, 11);
        System.out.println("После вызова delete(3, 11): " + sb);

        sb.deleteCharAt(0);
        System.out.println("После вызова deleteCharAt(0): " + sb);

    }
}
