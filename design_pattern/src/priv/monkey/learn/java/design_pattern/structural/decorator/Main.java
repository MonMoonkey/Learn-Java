package priv.monkey.learn.java.design_pattern.structural.decorator;

public class Main {
    public static void main(String[] args) {
        IShape circle = new Circle();
        IShape rectangle = new Rectangle();
        IShape colorCircle = new ColorShapeDecorator(new Circle());
        IShape colorRectangle = new ColorShapeDecorator(new Rectangle());

        circle.draw();
        rectangle.draw();
        colorCircle.draw();
        colorRectangle.draw();
    }
}
