package priv.monkey.learn.java.design_pattern.behavioral.interpreter;

import java.util.HashMap;

public interface Expression {
    int interpret(HashMap<String, Integer> var);
}
