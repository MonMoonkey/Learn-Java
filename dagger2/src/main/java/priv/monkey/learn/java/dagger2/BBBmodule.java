package priv.monkey.learn.java.dagger2;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

/**
 * @author:Monkey
 * @time: Create on 2018/6/1
 */
@Module
public class BBBmodule {
//    @Singleton
//    public String s;
////
////    public BBBmodule(String s) {
////        this.s=s;
////    }
    @Provides
    @NameMonkey("11111")
    public BBB provideBBB1(@SSS String s) {
        System.out.println("BBB1111");
        return new BBB(s);
    }

    @Provides
    @NameMonkey("22222")
    public BBB provideBBB2(@SSS String s) {
        System.out.println("BBB2222");
        return new BBB(s);
    }

}
