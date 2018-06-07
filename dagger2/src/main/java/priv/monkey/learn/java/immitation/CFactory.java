package priv.monkey.learn.java.immitation;

import com.google.auto.factory.AutoFactory;
import com.google.auto.factory.Provided;

/**
 * @author:Monkey
 * @time: Create on 2018/6/4
 */
@AutoFactory
public class CFactory {
    private String sss;

    public CFactory(@Provided String s, int a) {
        this.sss = s;
    }
}
