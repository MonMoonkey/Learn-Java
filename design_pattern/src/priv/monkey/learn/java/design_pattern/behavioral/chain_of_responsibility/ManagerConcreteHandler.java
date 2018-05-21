package priv.monkey.learn.java.design_pattern.behavioral.chain_of_responsibility;

public class ManagerConcreteHandler extends AbstractHandler {
    private int mPriceLimit;

    public ManagerConcreteHandler(int mPriceLimit) {
        this.mPriceLimit=mPriceLimit;
    }
    @Override
    public void handleRequest(Request request) {
        if (request.getPrice() <= mPriceLimit) {
            System.out.println(this.getClass().getSimpleName()+" 处理了报销请求：\""+request.getName()+"\", 报销费用为："+request.getPrice()+"元。\n");
        } else if (this.getSuccessor() != null) {
            System.out.println(this.getClass().getSimpleName() + "无法处理这个报销请求，交给" + getSuccessor().getClass().getSimpleName() + "处理！");
            this.getSuccessor().handleRequest(request);
        }else{
            System.out.println("没人来处理这个报销请求！");
        }
    }
}
