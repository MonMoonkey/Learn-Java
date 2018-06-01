package priv.monkey.learn.java.dagger2;

import dagger.BindsInstance;
import dagger.Component;

import javax.inject.Singleton;

/**
 * @author:Monkey
 * @time: Create on 2018/6/1
 */

////@Component(modules = BBBmodule.class)
//@Singleton
//@Component(modules = BBBmodule.class)
//public interface AAAcomponent {
//    AAA injectAAA();
//}

//@Component(modules = BBBmodule.class)
@Singleton
@Component(modules = BBBmodule.class)
public interface AAAcomponent {
    AAA injectAAA();

    @Component.Builder
    interface  Builder{
        @BindsInstance Builder sSS(@SSS String sName);
        AAAcomponent build();
    }
}
