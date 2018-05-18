package priv.monkey.learn.java.design_pattern.structural.flyweight;

public class Main {
    private static final String[] COLORS = {"Red", "Orange", "Yellow", "Green", "Cyan", "Blue", "Purple"};

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) FlyweightFactory.getCircle(getRandomColor());
            circle.setRadius(10);
            circle.setX(getRandomInt());
            circle.setY(getRandomInt());
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return COLORS[(int) (Math.random() * COLORS.length)];
    }

    private static int getRandomInt() {
        return (int) (Math.random() * 100);
    }
}
