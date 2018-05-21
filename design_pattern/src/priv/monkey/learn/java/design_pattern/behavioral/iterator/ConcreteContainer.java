package priv.monkey.learn.java.design_pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteContainer<T> implements Container {
    private List<T> list = new ArrayList<>();

    public void add(T obj) {
        list.add(obj);
    }

    public void remove(T obj) {
        list.remove(obj);
    }

    @Override
    public Iterator<T> getIterator() {
        return new ConcreteIterator<T>(list);
    }
}
