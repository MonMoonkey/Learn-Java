package priv.monkey.learn.java.design_pattern.behavioral.command.tv;

public class RemoteControl_Invoker {
    private Command tvOnCommand, tvOffCommand;

    public RemoteControl_Invoker(Command on, Command off) {
        this.tvOnCommand=on;
        this.tvOffCommand=off;
    }

    public void turnOn() {
        tvOnCommand.execute();
    }

    public void turnOff() {
        tvOffCommand.execute();
    }
}
