package priv.monkey.learn.java.design_pattern.behavioral.state;

/**
 * @author:Monkey
 * @time: Create on 2018/5/22
 */
public class Context {
    private IState state=new BeginState();

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    public void printState() {
        state.doAction(this);
    }
}
