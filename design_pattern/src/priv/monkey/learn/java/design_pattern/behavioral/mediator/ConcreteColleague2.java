package priv.monkey.learn.java.design_pattern.behavioral.mediator;

public class ConcreteColleague2 extends Colleague{

    public ConcreteColleague2(Mediator m) {
        super(m);
    }

    @Override
    public void doSelfAction() {
        System.out.println("ConcreteColleague2----doSelfMethod()");
    }

    @Override
    public void doSuperAction() {
        System.out.println("ConcreteColleague2----doDepMethod()");
        super.mediator.sentMessage("22222",this);
    }
}
