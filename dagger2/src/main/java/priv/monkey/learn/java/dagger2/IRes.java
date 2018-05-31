package priv.monkey.learn.java.dagger2;

import dagger.Component;

/**
 * @author:Monkey
 * @time: Create on 2018/5/31
 */
@Component
public interface IRes {
    void inject(Res res);
}
