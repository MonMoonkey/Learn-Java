package priv.monkey.learn.java.design_pattern.structural.flyweight;

import java.util.HashMap;

public class FlyweightFactory {
    private static final HashMap<String, IShape> circleMap = new HashMap<>();

    public static IShape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
        }
        return circle;
    }
}
