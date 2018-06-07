package priv.monkey.learn.java.immitation;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author:Monkey
 * @time: Create on 2018/6/4
 */
public class C implements IC {
    public String sss="DEFAULT";
    @Inject
    public C(String s) {
        this.sss = s;
    }

    public C(String s1, String s2) {

    }

//    @Inject
//    public C(){}
}
