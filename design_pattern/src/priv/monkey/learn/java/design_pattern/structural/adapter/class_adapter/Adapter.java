package priv.monkey.learn.java.design_pattern.structural.adapter.class_adapter;

public class Adapter extends Adaptee implements ITarget{
    @Override
    public void doTargetThing() {
        this.doOriginThing();
        //然后可以根据需要做一些转换操作，完成doTargetThing所需的要求
    }
}
