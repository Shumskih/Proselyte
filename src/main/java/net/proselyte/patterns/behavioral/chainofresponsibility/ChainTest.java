package main.java.net.proselyte.patterns.behavioral.chainofresponsibility;

public class ChainTest {
    public static void main(String[] args) {
        Logger smsLogger = new SMSLogger(Level.ERROR);
        Logger fileLogger = new FileLogger(Level.DEBUG);
        Logger emailLogger = new EmailLogger(Level.INFO);
        smsLogger.setNext(fileLogger);
        fileLogger.setNext(emailLogger);

        smsLogger.writeMessage("All bad!!!", Level.ERROR);
        fileLogger.writeMessage("Debugging", Level.DEBUG);
        emailLogger.writeMessage("It's OK!", Level.INFO);
    }
}
