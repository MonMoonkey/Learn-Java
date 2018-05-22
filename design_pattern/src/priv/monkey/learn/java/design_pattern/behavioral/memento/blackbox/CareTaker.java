package priv.monkey.learn.java.design_pattern.behavioral.memento.blackbox;

import priv.monkey.learn.java.design_pattern.behavioral.memento.whitebox.Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Monkey
 * @time: Create on 2018/5/22
 */
public class CareTaker {
    private List<IMemento> mementoList = new ArrayList<>();

    public void add(IMemento m) {
        mementoList.add(m);
    }

    public IMemento get(int i) {
        return mementoList.get(i);
    }
}
