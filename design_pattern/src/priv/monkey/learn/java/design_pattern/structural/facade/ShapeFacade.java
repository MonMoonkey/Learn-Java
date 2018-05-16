package priv.monkey.learn.java.design_pattern.structural.facade;

public class ShapeFacade {
    private IShape circle;
    private IShape rectangle;
    private IShape triangle;

    public ShapeFacade(){
        circle = new Circle();
        rectangle = new Rectangle();
        triangle = new Triangle();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawTriangle() {
        triangle.draw();
    }
}
