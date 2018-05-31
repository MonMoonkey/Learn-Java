package priv.monkey.learn.java.design_pattern.behavioral.template;

/**
 * @author:Monkey
 * @time: Create on 2018/5/23
 */
public abstract class Template {
    public void commonMethod() {
        System.out.println("大家都起床了");
        this.step1();
        this.step2();
        this.endMethod();
    }

    public abstract void step1();

    public abstract void step2();

    public void endMethod() {
        System.out.println("大家都睡觉了！");
    }
}
