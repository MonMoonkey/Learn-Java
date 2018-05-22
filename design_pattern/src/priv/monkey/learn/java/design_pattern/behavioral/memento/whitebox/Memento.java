package priv.monkey.learn.java.design_pattern.behavioral.memento.whitebox;

/**
 * @author:Monkey
 * @time: Create on 2018/5/22
 */
public class Memento {
    private String state;

    public String getState() {
        return state;
    }

    public Memento(String s) {
        this.state=s;
    }

}
