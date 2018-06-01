package priv.monkey.learn.java.dagger2;

import javax.inject.Inject;

/**
 * @author:Monkey
 * @time: Create on 2018/5/31
 */
public class Main {

    public static void main(String[] args) {
//        DaggerIMainComponent.builder().build();

//        System.out.println(p.sss);
//        AAAcomponent AC = DaggerAAAcomponent.builder().bBBmodule(new BBBmodule("Fri")).build();
        AAAcomponent AC = DaggerAAAcomponent.builder().sSS("FRI").build();
        AAA a = AC.injectAAA();
        AAA aa = AC.injectAAA();
        System.out.println(a.b.sss);
    }
}
