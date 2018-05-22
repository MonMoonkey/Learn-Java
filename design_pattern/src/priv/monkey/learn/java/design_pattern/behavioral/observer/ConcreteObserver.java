package priv.monkey.learn.java.design_pattern.behavioral.observer;

/**
 * @author:Monkey
 * @time: Create on 2018/5/22
 */
public class ConcreteObserver implements IObserver{

    private String name;
    public ConcreteObserver(String s) {
        this.name=s;
    }

    @Override
    public void update() {
        System.out.println(name + "收到了更新通知！");
    }
}
