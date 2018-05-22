package priv.monkey.learn.java.design_pattern.behavioral.memento.historyonself;

/**
 * @author:Monkey
 * @time: Create on 2018/5/22
 */
public class Originator {
    public String state;

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateToMemento() {
       return   new Memento(this);
    }

    public void restoreStateFromMemento(IMemento memento){
        Memento m = (Memento) memento;
        this.state = m.state;
    }


    private class Memento implements IMemento {
        private String state;

        private Memento(Originator o) {
            this.state = o.state;
        }

        public String getState() {
            return state;
        }

    }

}
