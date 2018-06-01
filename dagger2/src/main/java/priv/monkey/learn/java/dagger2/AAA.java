package priv.monkey.learn.java.dagger2;

import javax.inject.Inject;

/**
 * @author:Monkey
 * @time: Create on 2018/6/1
 */
public class AAA {
    public BBB b;
    @Inject
    public AAA(BBB b) {
        this.b=b;
    }
}
