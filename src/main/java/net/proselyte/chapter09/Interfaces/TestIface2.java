package main.java.net.proselyte.chapter09.Interfaces;

class TestIface2 {
    public static void main (String args[]) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callBack(42);

        c = ob; // Теперь переменная ссылается на объект AnotherClient
        c.callBack(42);
    }
}
