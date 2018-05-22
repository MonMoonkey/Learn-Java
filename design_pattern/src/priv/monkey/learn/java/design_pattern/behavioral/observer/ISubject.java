package priv.monkey.learn.java.design_pattern.behavioral.observer;

/**
 * @author:Monkey
 * @time: Create on 2018/5/22
 */
public interface ISubject {
    void registerObserver(IObserver observer);

    void removeObserver(IObserver observer);

    void notifyAllObserver();
}
