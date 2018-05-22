package priv.monkey.learn.java.design_pattern.behavioral.memento.blackbox;

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

    public IMemento saveStateToMemento() {
        return new Memento(state);
    }

    public void restoreStateFromMemento(IMemento memento) {
        //不cast没法access getState方法
        this.state =((Memento) memento).getState();
    }

    private class Memento implements IMemento {
        private String state;

        private Memento(String s) {
            this.state = s;
        }

        private String getState() {
            return state;
        }

        private void setState(String state) {
            this.state = state;
        }

    }
}
