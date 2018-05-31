package priv.monkey.learn.java.design_pattern.behavioral.strategy;

/**
 * @author:Monkey
 * @time: Create on 2018/5/23
 */
public class Context {
    private IStrategy strategy;

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {
        return strategy.doOperatioin(a, b);
    }

}
