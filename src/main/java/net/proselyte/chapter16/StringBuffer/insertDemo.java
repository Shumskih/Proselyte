package main.java.net.proselyte.chapter16.StringBuffer;

// Применение метода insert()
class insertDemo {
    public static void main (String args[]) {
        StringBuffer sb = new StringBuffer("Мне Java!");
        sb.insert(4, "нравится ");
        System.out.println(sb);
    }
}
