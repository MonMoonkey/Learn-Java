package priv.monkey.learn.java.design_pattern.behavioral.mediator;

public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator m) {
        super(m);
    }

    @Override
    public void doSelfAction() {
        System.out.println("ConcreteColleague1----doSelfMethod()");
    }

    @Override
    public void doSuperAction() {
        System.out.println("ConcreteColleague1----doDepMethod()");
        super.mediator.sentMessage("11111",this);
    }
}
