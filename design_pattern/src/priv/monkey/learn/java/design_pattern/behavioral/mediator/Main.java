package priv.monkey.learn.java.design_pattern.behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();
        ConcreteColleague1 c1 = new ConcreteColleague1(concreteMediator);
        ConcreteColleague2 c2 = new ConcreteColleague2(concreteMediator);
        concreteMediator.setColleague1(c1);
        concreteMediator.setColleague2(c2);

        c1.doSelfAction();
        c1.doSuperAction();
    }
}
