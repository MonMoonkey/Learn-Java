package priv.monkey.learn.java.rxjava;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:Monkey
 * @time: Create on 2018/6/7
 */
public class Plan {

    private String time;
    private String content;
    private List<String> actionList = new ArrayList<>();

    public Plan(String time, String content,List<String> actions) {
        this.time = time;
        this.content = content;
        this.actionList = actions;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getActionList() {
        return actionList;
    }

    public void setActionList(List<String> actionList) {
        this.actionList = actionList;
    }
}
