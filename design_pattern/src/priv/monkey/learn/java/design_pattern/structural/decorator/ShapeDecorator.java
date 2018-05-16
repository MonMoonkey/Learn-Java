package priv.monkey.learn.java.design_pattern.structural.decorator;

public class ShapeDecorator implements IShape {
    //protected修饰可以使继承的子类直接使用
    protected IShape shape;

    public ShapeDecorator(IShape shape) {
        this.shape = shape;
    }
    @Override
    public void draw() {
        shape.draw();
    }
}
