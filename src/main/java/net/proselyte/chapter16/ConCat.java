package main.java.net.proselyte.chapter16;

// Сцепление символьных строк
public class ConCat {
    public static void main (String args[]) {
        String longStr = "Это может быть очень длинная строка, " +
                        "которую следовало бы перенести на " +
                        "новую строку. Но благодаря сцеплению " +
                        "этого удаётся избежать.";
        System.out.println(longStr);
    }
}
