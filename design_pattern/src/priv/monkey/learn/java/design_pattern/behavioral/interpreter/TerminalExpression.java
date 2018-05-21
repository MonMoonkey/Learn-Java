package priv.monkey.learn.java.design_pattern.behavioral.interpreter;

import java.util.HashMap;

public class TerminalExpression implements Expression {
    private String key;
    public TerminalExpression(String k) {
        this.key=k;
    }
    @Override
    public int interpret(HashMap<String, Integer> var) {
        return var.get(key);
    }
}
