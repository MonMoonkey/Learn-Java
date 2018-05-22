package priv.monkey.learn.java.design_pattern.behavioral.mediator;

public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator m){
        this.mediator=m;
    }

    public abstract void doSelfAction();

    public abstract void doSuperAction();


}
