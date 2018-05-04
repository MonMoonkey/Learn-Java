package priv.monkey.learn.java.design_pattern.structural.proxy;

public class ProxySubject implements ISubject {
    private ISubject subject;
    private String name;

    public ProxySubject(String name){
        this.name=name;
    }
    @Override
    public void printName() {
        if(subject==null){
            subject=new RealSubject(name);
        }
        subject.printName();
    }
}
