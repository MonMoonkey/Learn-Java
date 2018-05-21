package priv.monkey.learn.java.design_pattern.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        ConcreteContainer<String> s = new ConcreteContainer<>();
        s.add("hello");
        s.add("thankyou");
        s.add("fine");
        s.add("andyou");
        Iterator<String> iterator = s.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
