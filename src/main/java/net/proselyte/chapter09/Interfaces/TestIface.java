package main.java.net.proselyte.chapter09.Interfaces;

class TestIface {
    public static void main (String args[]) {
        Callback c = new Client();
        c.callBack(42);
    }
}
