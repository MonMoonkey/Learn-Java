package priv.monkey.learn.java.dagger2;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * @author:Monkey
 * @time: Create on 2018/6/1
 */
public class BBB {
    public  String sss = "xixipi";
    @Inject
    public BBB(String s) {
            System.out.println("CCCCC");
            this.sss=s;
    }
}
