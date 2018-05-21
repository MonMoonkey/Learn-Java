package priv.monkey.learn.java.design_pattern.behavioral.command.tv;

public class TV_Off_Command implements Command{
    private TV_Receiver tv;
    public TV_Off_Command(TV_Receiver r){
        this.tv=r;
    }

    @Override
    public void execute() {
        tv.off();
    }
}
