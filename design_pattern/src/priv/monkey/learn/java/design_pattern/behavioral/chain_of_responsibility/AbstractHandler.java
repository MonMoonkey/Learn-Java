package priv.monkey.learn.java.design_pattern.behavioral.chain_of_responsibility;

public abstract class AbstractHandler {
    private AbstractHandler successor;

    public AbstractHandler getSuccessor() {
        return successor;
    }

    public void setSuccessor(AbstractHandler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);
}
