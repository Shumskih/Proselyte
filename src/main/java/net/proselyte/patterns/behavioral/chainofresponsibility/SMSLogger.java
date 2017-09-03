package main.java.net.proselyte.patterns.behavioral.chainofresponsibility;

public class SMSLogger extends Logger {
    public SMSLogger(int priority) {
        super(priority);
    }

    public void write(String message) {
        System.out.println("SMS: " + message);
    }
}
