package priv.monkey.learn.java.design_pattern.behavioral.chain_of_responsibility;

public class CEOConcreteHandler extends AbstractHandler{
    private int mPriceLimit;

    public CEOConcreteHandler(int mPriceLimit) {
        this.mPriceLimit=mPriceLimit;
    }
    @Override
    public void handleRequest(Request request) {
        if (request.getPrice() <= mPriceLimit) {
            System.out.println(this.getClass().getSimpleName()+" 处理了报销请求：\""+request.getName()+"\", 报销费用为："+request.getPrice()+"元。\n");
        } else {
            System.out.println(getClass().getSimpleName()+": 报销请求被驳回！");
        }
    }
}
