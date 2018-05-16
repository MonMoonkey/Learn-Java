package priv.monkey.learn.java.design_pattern.structural.decorator;

public class Rectangle implements IShape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
