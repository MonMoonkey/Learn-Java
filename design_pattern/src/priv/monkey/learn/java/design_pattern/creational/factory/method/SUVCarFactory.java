package priv.monkey.learn.java.design_pattern.creational.factory.method;

public class SUVCarFactory implements IFactory {
    @Override
    public ICar createCar() {
        return new SUVCar();
    }
}