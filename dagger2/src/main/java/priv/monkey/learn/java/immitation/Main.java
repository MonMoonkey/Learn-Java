package priv.monkey.learn.java.immitation;

/**
 * @author:Monkey
 * @time: Create on 2018/6/4
 */
public class Main {
    public static void main(String[] args) {
        Acomponent ac = DaggerAcomponent.builder().sSS("Mon").build();
        A a = ac.injectA();
        System.out.println(((C)a.b.c).sss);
        System.out.println(((C)((D)a.b.d).c).sss);
    }
}
