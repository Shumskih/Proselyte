package main.java.net.proselyte.chapter05;

// Начиная с JDK7 использовать символьные строки для управления оператором switch
class StringSwitch {
    public static void main (String args[]) {
        String str = "два";
        switch (str) {
            case "один":
                System.out.println("Один");
                break;
            case "два":
                System.out.println("Два");
                break;
            case "три":
                System.out.println("три");
                break;
            default:
                System.out.println("Не совпало");
                break;
        }
    }
}
