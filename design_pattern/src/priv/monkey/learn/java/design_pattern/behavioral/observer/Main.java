package priv.monkey.learn.java.design_pattern.behavioral.observer;

/**
 * @author:Monkey
 * @time: Create on 2018/5/22
 */
public class Main {
    public static void main(String[] args) {
        ConcreteObserver o1 = new ConcreteObserver("111");
        ConcreteObserver o2 = new ConcreteObserver("222");
        ConcreteObserver o3 = new ConcreteObserver("333");
        ConcreteObserver o4 = new ConcreteObserver("444");

        ConcreteSubject subject = new ConcreteSubject();
        subject.registerObserver(o1);
        subject.registerObserver(o2);
        subject.registerObserver(o3);
        subject.registerObserver(o4);

        subject.notifyAllObserver();
    }
}
