package priv.monkey.learn.java.design_pattern.structural.decorator;

public class ColorShapeDecorator extends  ShapeDecorator {
    public ColorShapeDecorator(IShape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        setColorBorder(shape);
    }

    private void setColorBorder(IShape shape) {
        System.out.println("Border Color: Red" );
    }
}
