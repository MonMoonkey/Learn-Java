package priv.monkey.learn.java.design_pattern.creational.builder;

/**
 * 厂方法模式注重的是整体对象的创建方法，而建造者模式注重的是部件构建的过程，旨在通过一步一步地精确构造创建出一个复杂的对象。
 */
// Builder 可以是 抽象类 也可以是 接口
public abstract class Builder {

    public abstract void buideHead();
    public abstract void buideBody();
    public abstract void buideFoot();
    public abstract Product getProduct();
}
