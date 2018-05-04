package priv.monkey.learn.java.design_pattern.creational.builder;

public class Director {
    public Product constructProduct(ConcreteBuilder concreteBuilder){
        concreteBuilder.buideHead();
        concreteBuilder.buideBody();
        concreteBuilder.buideFoot();
        return concreteBuilder.getProduct();
    }
}
