package priv.monkey.learn.java.design_pattern.structural.bridge;

public class ConcreteImplementorA implements IImplementor {
    @Override
    public void operationImp() {
        System.out.println("ConcreteImplementorA.operationImp()");
    }
}
