package priv.monkey.learn.java.design_pattern.structural.flyweight;

public class Circle implements IShape {

    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color=color;
    }
    @Override
    public void draw() {

    }
}
