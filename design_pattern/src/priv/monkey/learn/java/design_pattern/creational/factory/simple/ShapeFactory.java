package priv.monkey.learn.java.design_pattern.creational.factory.simple;

public class ShapeFactory {
    public IShape getShape(String shapeType){
        if(shapeType==null){
            return null;
        }
        if(shapeType.equals("circle")){
            return new Circle();
        }
        if(shapeType.equals("rectangle")){
            return new Rectangle();
        }
        if(shapeType.equals("triangle")){
            return new Triangle();
        }
        return null;
    }
}
