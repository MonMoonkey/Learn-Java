package priv.monkey.learn.java.design_pattern.behavioral.template;

/**
 * @author:Monkey
 * @time: Create on 2018/5/23
 */
public class Student extends Template {
    @Override
    public void step1() {
        System.out.println("学生去上学了！");
    }

    @Override
    public void step2() {
        System.out.println("学生放学了！");
    }
}
