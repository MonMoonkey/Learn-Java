package priv.monkey.learn.java.design_pattern.behavioral.command.tv;

public class Tv_On_Command implements Command {
    private TV_Receiver tv;

    public Tv_On_Command(TV_Receiver r) {
        this.tv = r;
    }

    @Override
    public void execute() {
        tv.on();
    }
}
