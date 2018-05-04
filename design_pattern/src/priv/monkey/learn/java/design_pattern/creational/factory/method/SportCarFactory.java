package priv.monkey.learn.java.design_pattern.creational.factory.method;

public class SportCarFactory implements IFactory {
    @Override
    public ICar createCar() {
        return new SportCar();
    }
}
