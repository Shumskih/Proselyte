package main.java.net.proselyte.patterns.behavioral.chainofresponsibility;

abstract class Logger {
    int priority;

    public void writeMessage(String message, int level) {
        if(level <= priority) {
            write(message);
        }
        if(next != null) {
            next.writeMessage(message, level);
        }
    }

    abstract void write(String message);

    public Logger(int priority) {
        this.priority = priority;
    }

    Logger next;
    public void setNext(Logger next) {
        this.next = next;
    }
}
