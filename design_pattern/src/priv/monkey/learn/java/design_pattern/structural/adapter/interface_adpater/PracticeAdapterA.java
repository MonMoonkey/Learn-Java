package priv.monkey.learn.java.design_pattern.structural.adapter.interface_adpater;

public class PracticeAdapterA extends Adapter {
    @Override
    public int outputA() {
        int a = super.outputA();
        a=a+5;
        return a;
    }
}
