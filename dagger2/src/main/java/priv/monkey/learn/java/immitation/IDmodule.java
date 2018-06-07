package priv.monkey.learn.java.immitation;

import dagger.Binds;
import dagger.Module;

/**
 * @author:Monkey
 * @time: Create on 2018/6/4
 */
@Module
public abstract  class IDmodule {
    @Binds
    public abstract ID provideID(D d);
}
