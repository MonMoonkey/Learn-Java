package priv.monkey.learn.java.design_pattern.behavioral.command;

public class ConcreteCommand implements Command {
    private Receiver receiver;

    public ConcreteCommand(Receiver r) {
        this.receiver=r;
    }

    @Override
    public void execute() {
    receiver.action();
    }
}
