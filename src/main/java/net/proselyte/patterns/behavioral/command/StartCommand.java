package main.java.net.proselyte.patterns.behavioral.command;

// ConcreteCommand
public class StartCommand implements Command{
    Comp computer;

    public StartCommand(Comp computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.start();
    }
}
