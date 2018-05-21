package priv.monkey.learn.java.design_pattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteIterator<T> implements Iterator {
    private int index = 0;
    private List<T> list = new ArrayList<>();

    public ConcreteIterator(List<T> l){
        this.list = l;
    }


    @Override
    public boolean hasNext() {
        return index != list.size();
    }

    @Override
    public Object next() {
        T object = null;
        if (hasNext()) {
            object = list.get(index);
            index = index + 1;
        }
        return object;
    }
}
