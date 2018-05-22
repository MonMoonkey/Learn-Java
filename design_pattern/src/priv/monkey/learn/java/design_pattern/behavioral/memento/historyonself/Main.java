package priv.monkey.learn.java.design_pattern.behavioral.memento.historyonself;

/**
 * @author:Monkey
 * @time: Create on 2018/5/22
 */
public class Main {
    public static void main(String[] args) {
        Originator o = new Originator();
        o.setState("111");
        IMemento memento = o.saveStateToMemento();
        o.setState("222");
        o.restoreStateFromMemento(memento);
    }
}
