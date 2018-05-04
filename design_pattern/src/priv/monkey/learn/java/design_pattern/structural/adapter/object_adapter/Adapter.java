package priv.monkey.learn.java.design_pattern.structural.adapter.object_adapter;

public class Adapter implements ITarget{
    private Adaptee adaptee;
    public Adapter(Adaptee adaptee){
        this.adaptee=adaptee;
    }
    @Override
    public void doTargetThing() {
        adaptee.doOriginThing();
    }
}
