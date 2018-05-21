package priv.monkey.learn.java.design_pattern.behavioral.command;

public class Invoker {
    private Command command;
    public Invoker(Command c) {
        this.command=c;
    }

    public void invoke() {
        command.execute();
    }
}
