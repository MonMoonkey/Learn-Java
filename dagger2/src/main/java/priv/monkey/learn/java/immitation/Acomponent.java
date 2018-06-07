package priv.monkey.learn.java.immitation;

import dagger.BindsInstance;
import dagger.Component;
import priv.monkey.learn.java.dagger2.EEE;
import priv.monkey.learn.java.dagger2.SSS;

/**
 * @author:Monkey
 * @time: Create on 2018/6/4
 */
@Component(modules = {IDmodule.class,ICmodule.class})
public interface Acomponent {
    A injectA();

    @Component.Builder
    interface  Builder{
        @BindsInstance
        Acomponent.Builder sSS(@SSS String sName);
        Acomponent build();
    }
}
