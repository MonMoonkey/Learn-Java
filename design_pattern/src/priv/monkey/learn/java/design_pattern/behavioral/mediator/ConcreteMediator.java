package priv.monkey.learn.java.design_pattern.behavioral.mediator;

public class ConcreteMediator implements Mediator {

    private Colleague colleague1;
    private Colleague colleague2;

//    public ConcreteMediator(Colleague c1,Colleague c2) {
//        this.colleague1=c1;
//        this.colleague2=c2;
//    }

    public void setColleague1(Colleague colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(Colleague colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void sentMessage(String s, Colleague c) {
        if (c instanceof ConcreteColleague1) {
            colleague2.doSelfAction();
        } else {
            colleague1.doSelfAction();
        }
    }
}
