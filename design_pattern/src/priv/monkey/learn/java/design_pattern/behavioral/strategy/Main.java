package priv.monkey.learn.java.design_pattern.behavioral.strategy;

/**
 * @author:Monkey
 * @time: Create on 2018/5/23
 */
public class Main {
    public static void main(String[] args) {
        Context c = new Context();
        c.setStrategy(new AddStrategy());
        System.out.println(c.executeStrategy(3, 5));
        c.setStrategy(new SubStrategy());
        System.out.println(c.executeStrategy(5, 3));
    }
}
