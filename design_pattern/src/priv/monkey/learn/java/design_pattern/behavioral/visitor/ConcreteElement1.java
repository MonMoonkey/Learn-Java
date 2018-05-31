package priv.monkey.learn.java.design_pattern.behavioral.visitor;

/**
 * @author:Monkey
 * @time: Create on 2018/5/23
 */
public class ConcreteElement1 implements IElement  {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visitElement1(this);
    }
}
