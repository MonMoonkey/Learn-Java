package priv.monkey.learn.java.design_pattern.creational.builder;

/**
 * 实体建造类可以是继承 抽象类 或者实现 接口
 */
public class ConcreteBuilder extends Builder {

    private Product product = new Product();

    @Override
    public void buideHead() {
        product.buideHead("Head");
    }

    @Override
    public void buideBody() {
        String[] bodies = new String[]{"Body.part 1","Body.part 2","Body.part 3"};
        for(String body:bodies){
            product.buideBody(body);
        }
    }

    @Override
    public void buideFoot() {
        product.buideFoot("Foot");
    }

    @Override
    public Product getProduct(){
        return  product;
    }
}
