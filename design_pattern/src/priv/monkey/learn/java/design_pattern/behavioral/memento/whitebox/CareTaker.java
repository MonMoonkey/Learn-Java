package priv.monkey.learn.java.design_pattern.behavioral.memento.whitebox;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Monkey
 * @time: Create on 2018/5/22
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento m) {
        mementoList.add(m);
    }

    public Memento get(int i) {
        return mementoList.get(i);
    }
}
