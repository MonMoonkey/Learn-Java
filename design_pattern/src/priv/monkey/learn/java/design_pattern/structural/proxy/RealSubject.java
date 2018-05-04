package priv.monkey.learn.java.design_pattern.structural.proxy;

public class RealSubject implements ISubject {
    private String name;

    public RealSubject(String name){
        this.name=name;
    }
    @Override

    public void printName() {
        if (name != null) {
            System.out.println(name);
        }
    }
}
