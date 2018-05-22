package priv.monkey.learn.java.design_pattern.behavioral.state;

/**
 * @author:Monkey
 * @time: Create on 2018/5/22
 */
public class BeginState implements IState {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in BEGIN state");
        context.setState(this);
    }
}
