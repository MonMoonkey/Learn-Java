package priv.monkey.learn.java.design_pattern.creational.factory.simple;

public class Triangle implements IShape {
    @Override
    public void draw() {
        System.out.println("画出了一个 矩形！");
    }
}
