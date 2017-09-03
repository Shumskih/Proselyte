package main.java.net.proselyte.patterns.behavioral.chainofresponsibility;

public class EmailLogger extends Logger {
    public EmailLogger(int priority) {
        super(priority);
    }

    public void write(String message) {
        System.out.println("E-mail message: " + message);
    }
}
