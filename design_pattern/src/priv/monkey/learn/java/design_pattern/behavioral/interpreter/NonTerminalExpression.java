package priv.monkey.learn.java.design_pattern.behavioral.interpreter;

import java.util.HashMap;

public abstract class NonTerminalExpression implements  Expression{
    protected Expression left;
    protected Expression right;

    public NonTerminalExpression(Expression l, Expression r) {
        this.left = l;
        this.right = r;
    }

}
