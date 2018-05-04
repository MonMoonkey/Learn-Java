package priv.monkey.learn.java.design_pattern.structural.adapter.interface_adpater;

public class PracticeAdapterB extends Adapter {
    @Override
    public int outputB() {
        int b = super.outputB();
        b = b + 10;
        return b;
    }
}
