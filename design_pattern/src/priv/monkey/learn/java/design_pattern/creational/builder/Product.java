package priv.monkey.learn.java.design_pattern.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private List<String> bodies = new ArrayList<>();

    public void buideHead(String head){
        System.out.println(head+" 被建造了！");
    }

    public void buideBody(String body){
        bodies.add(body);
        System.out.println(body+" 被建造了！");
    }

    public void buideFoot(String foot){
        System.out.println(foot+" 被建造了！");
    }
}
