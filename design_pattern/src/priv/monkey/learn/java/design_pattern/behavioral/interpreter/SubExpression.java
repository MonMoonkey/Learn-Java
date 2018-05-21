package priv.monkey.learn.java.design_pattern.behavioral.interpreter;

import java.util.HashMap;

public class SubExpression extends NonTerminalExpression {

    public SubExpression(Expression l, Expression r) {
        super(l, r);
    }

    @Override
    public int interpret(HashMap<String, Integer> var) {
        return super.left.interpret(var)-super.right.interpret(var);
    }
}
