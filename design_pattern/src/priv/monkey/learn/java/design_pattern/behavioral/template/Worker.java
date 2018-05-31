package priv.monkey.learn.java.design_pattern.behavioral.template;

/**
 * @author:Monkey
 * @time: Create on 2018/5/23
 */
public class Worker extends Template {
    @Override
    public void step1() {
        System.out.println("工人上班了！");

    }

    @Override
    public void step2() {
        System.out.println("工人下班了！");

    }
}
