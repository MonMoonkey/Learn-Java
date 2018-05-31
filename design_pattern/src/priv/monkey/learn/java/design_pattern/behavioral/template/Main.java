package priv.monkey.learn.java.design_pattern.behavioral.template;

/**
 * @author:Monkey
 * @time: Create on 2018/5/23
 */

public class Main {
    public static void main(String[] args) {
        Template student = new Student();
        student.commonMethod();
        Template worker = new Worker();
        worker.commonMethod();
    }
}
