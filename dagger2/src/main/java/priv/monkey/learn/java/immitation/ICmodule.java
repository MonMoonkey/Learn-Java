package priv.monkey.learn.java.immitation;

import dagger.BindsInstance;
import dagger.Module;
import dagger.Provides;
import priv.monkey.learn.java.dagger2.EEE;
import priv.monkey.learn.java.dagger2.SSS;

import javax.inject.Named;

/**
 * @author:Monkey
 * @time: Create on 2018/6/4
 */
@Module
public class ICmodule {
    @Provides
    @Named("111")
    public IC provideIC1(@SSS String s) {
        return new C(s);
    }
    @Provides
    @Named("222")
    public IC provideIC2() {
        return new C("Fri");
    }

    @Provides
    @Named("333")
    public IC provideIC3() {
        return new C("");
    }

}
