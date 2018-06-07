package priv.monkey.learn.java.dagger2;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author:Monkey
 * @time: Create on 2018/6/4
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface NameMonkey {
    String value() default "";
}
