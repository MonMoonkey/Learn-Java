package priv.monkey.learn.java.design_pattern.behavioral.state;

/**
 * @author:Monkey
 * @time: Create on 2018/5/22
 */
public class EndState implements IState {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in END state");
        context.setState(this);
    }
}
