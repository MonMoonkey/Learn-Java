package priv.monkey.learn.java.design_pattern.creational.prototype;


//可以不需要这个抽象类，可以直接实现Cloneable接口
public abstract class Prototype implements Cloneable {
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
