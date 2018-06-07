package priv.monkey.learn.java.immitation;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author:Monkey
 * @time: Create on 2018/6/4
 */
public class B {
    public IC c;
    public ID d;
    @Inject
    public B(@Named("111") IC c, ID d) {
        this.c=c;
        this.d=d;
    }
}
