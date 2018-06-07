package priv.monkey.learn.java.immitation;

import javax.inject.Inject;

/**
 * @author:Monkey
 * @time: Create on 2018/6/4
 */
public class A {
    public B b;
    @Inject
    public A(B b) {
        this.b = b;
    }
}
