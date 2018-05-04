package priv.monkey.learn.java.design_pattern.creational.prototype;

public class ConcretePrototype extends Prototype{
    private String name;
    private DataBean dataBean;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DataBean getDataBean() {
        return dataBean;
    }

    public void setDataBean(DataBean dataBean) {
        this.dataBean = dataBean;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        ConcretePrototype concretePrototype=(ConcretePrototype) super.clone();
        concretePrototype.dataBean=(DataBean)dataBean.clone();
        return concretePrototype;
    }
}
