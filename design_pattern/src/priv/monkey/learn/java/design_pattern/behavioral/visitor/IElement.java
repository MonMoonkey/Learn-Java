package priv.monkey.learn.java.design_pattern.behavioral.visitor;

/**
 * @author:Monkey
 * @time: Create on 2018/5/23
 */
public interface IElement {
    void accept(IVisitor visitor);
}
