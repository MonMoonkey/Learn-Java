package priv.monkey.learn.java.design_pattern.creational.prototype;

//用于测试一个类中还有另一个类的实例时如何深拷贝，这个类也需要实现Cloneable接口
public class DataBean implements Cloneable{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
