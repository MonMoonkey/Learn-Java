package priv.monkey.learn.java.design_pattern.behavioral.memento.whitebox;

/**
 * @author:Monkey
 * @time: Create on 2018/5/22
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void restoreStateFromMemento(Memento m) {
        this.state = m.getState();
    }

}
