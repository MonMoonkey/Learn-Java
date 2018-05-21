package priv.monkey.learn.java.design_pattern.behavioral.command;

public class Main {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.invoke();
    }
}
