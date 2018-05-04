package priv.monkey.learn.java.design_pattern.structural.bridge;

public class ConcreteImplementorB implements IImplementor {
    @Override
    public void operationImp() {
        System.out.println("ConcreteImplementorB.operationImp()");
    }
}
