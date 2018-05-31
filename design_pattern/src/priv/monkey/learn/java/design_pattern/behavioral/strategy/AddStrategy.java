package priv.monkey.learn.java.design_pattern.behavioral.strategy;

/**
 * @author:Monkey
 * @time: Create on 2018/5/23
 */
public class AddStrategy implements IStrategy {
    @Override
    public int doOperatioin(int a, int b) {
        return a+b;
    }
}
