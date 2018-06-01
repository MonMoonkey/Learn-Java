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
    public BBB provideBBB(@SSS String s) {
        System.out.println("BBBBBBBB");
        return new BBB(s);
    }
}
