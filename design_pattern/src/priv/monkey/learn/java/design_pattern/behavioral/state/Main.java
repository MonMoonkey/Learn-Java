package priv.monkey.learn.java.design_pattern.behavioral.state;

/**
 * @author:Monkey
 * @time: Create on 2018/5/22
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.printState();
        context.setState(new EndState());
        context.printState();
    }
}
