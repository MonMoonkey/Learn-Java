package priv.monkey.learn.java.design_pattern.behavioral.chain_of_responsibility;

public class Request {
    private int price;
    private String name;

    public Request(int p, String n) {
        this.price=p;
        this.name=n;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
