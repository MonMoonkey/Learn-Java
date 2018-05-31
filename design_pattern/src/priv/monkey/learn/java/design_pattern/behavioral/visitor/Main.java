package priv.monkey.learn.java.design_pattern.behavioral.visitor;


/**
 * @author:Monkey
 * @time: Create on 2018/5/23
 */
public class Main {

    public static void main(String[] args) {

        IVisitor visitor = new ConcreteVisitor();
        IElement e1 = new ConcreteElement1();
        IElement e2 = new ConcreteElement2();
        e1.accept(visitor);
        e2.accept(visitor);

    }
}
