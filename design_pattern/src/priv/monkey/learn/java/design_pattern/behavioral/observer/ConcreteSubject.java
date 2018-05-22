package priv.monkey.learn.java.design_pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Monkey
 * @time: Create on 2018/5/22
 */
public class ConcreteSubject implements ISubject {
    private List<IObserver> observerList = new ArrayList<>();

    @Override
    public void registerObserver(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        for (IObserver o : observerList) {
            o.update();
        }

    }
}
