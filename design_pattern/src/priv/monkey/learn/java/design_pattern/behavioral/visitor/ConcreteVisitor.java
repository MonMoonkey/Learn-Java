package priv.monkey.learn.java.design_pattern.behavioral.visitor;

/**
 * @author:Monkey
 * @time: Create on 2018/5/23
 */
public class ConcreteVisitor implements IVisitor{
    @Override
    public void visitElement1(IElement element) {
        System.out.println("Visitor 访问了"+element.getClass().getSimpleName());
    }

    @Override
    public void visitElement2(IElement element) {
        System.out.println("Visitor 访问了"+element.getClass().getSimpleName());
    }
}
