package priv.monkey.learn.java.design_pattern.structural.facade;


public class Rectangle implements IShape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
