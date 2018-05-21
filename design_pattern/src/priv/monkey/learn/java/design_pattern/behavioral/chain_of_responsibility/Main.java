package priv.monkey.learn.java.design_pattern.behavioral.chain_of_responsibility;

public class Main {
    public static void main(String[] args) {
        Request request = new Request(5800, "聚餐报销费用！吃的日料自助！");
        Request request1 = new Request(90, "办公报销费用！买打印纸！");
        Request request2 = new Request(800, "采购报销费用！买空气净化器！");
        Request request3 = new Request(8900, "旅游报销费用！去的迪拜！");

        LeaderConcreteHandler leaderConcreteHandler = new LeaderConcreteHandler(100);
        ManagerConcreteHandler managerConcreteHandler = new ManagerConcreteHandler(1000);
        CEOConcreteHandler ceoConcreteHandler = new CEOConcreteHandler(8000);
        leaderConcreteHandler.setSuccessor(managerConcreteHandler);
        managerConcreteHandler.setSuccessor(ceoConcreteHandler);

        leaderConcreteHandler.handleRequest(request);
        leaderConcreteHandler.handleRequest(request1);
        leaderConcreteHandler.handleRequest(request2);
        leaderConcreteHandler.handleRequest(request3);
    }
}
