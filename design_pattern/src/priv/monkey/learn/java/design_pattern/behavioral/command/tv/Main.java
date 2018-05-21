package priv.monkey.learn.java.design_pattern.behavioral.command.tv;

public class Main {
    public static void main(String[] args) {
        TV_Receiver tv = new TV_Receiver();
        Command tvOnCommand = new Tv_On_Command(tv);
        Command tvOffCommand = new TV_Off_Command(tv);
        RemoteControl_Invoker invoker = new RemoteControl_Invoker(tvOnCommand, tvOffCommand);
        invoker.turnOn();
        invoker.turnOff();
    }
}
