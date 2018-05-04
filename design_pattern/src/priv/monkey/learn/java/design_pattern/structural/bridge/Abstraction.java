package priv.monkey.learn.java.design_pattern.structural.bridge;

public abstract class Abstraction {
    private IImplementor implementor;
    public IImplementor getImplementor(){
        return implementor;
    }
    public  void setImplementor(IImplementor implementor){
        this.implementor=implementor;
    }

    public abstract void operation();
}
