package priv.monkey.learn.java.design_pattern.behavioral.memento.blackbox;

/**
 * @author:Monkey
 * @time: Create on 2018/5/22
 */
public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("11111");
        originator.setState("22222");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("33333");
        careTaker.add(originator.saveStateToMemento());

        System.out.println("Current State: " + originator.getState());
        originator.restoreStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.restoreStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }

}
