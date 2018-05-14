package priv.monkey.learn.java.annotation;

import java.lang.annotation.*;

//@Documented 是否加入javadoc
//@Inherited 如果是修饰class的，如果修饰了父类，子类也被修饰
@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MonkeyAnnotation {
    enum Color{RED,GREEN,BLUE,BLACK,WHITE}

    String name() default "Monkey";
    int length() default 8;
    Color color() default Color.WHITE;
}

