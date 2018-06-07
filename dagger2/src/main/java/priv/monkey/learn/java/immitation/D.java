package priv.monkey.learn.java.immitation;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author:Monkey
 * @time: Create on 2018/6/4
 */
public class D implements ID {
    public String sss;
    public IC c;
    @Inject
    public D(@Named("333") IC c) {
        this.c = c;
//        this.sss= s;
    }
}
