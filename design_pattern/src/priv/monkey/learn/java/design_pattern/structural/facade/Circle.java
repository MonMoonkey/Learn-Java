package priv.monkey.learn.java.design_pattern.structural.facade;


public class Circle implements IShape  {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
