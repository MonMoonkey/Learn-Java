package priv.monkey.learn.java.design_pattern.creational.multiton;

import java.util.HashMap;

/**
 * 多并发请求环境下，系统需要为每个客户端的独立请求提供单独服务的资源，但是系统总的开销是有限的，系统在并发量很大时也不
 * 可能为所有的并发请求同时提供相应的资源，否则不但系统资源消耗量大而且非常耗时。这时就可以考虑使用池的概念，也即是一种
 * 多例模式的实现。具体的应用场景，比如数据库连接池、EJB无状态会话Bean的实例池
 * 代码实现上一般是提供一个容器类，也即是容纳资源对象的池，对象池的一些属性可以通过配置文件来配置，比如数据库连接池中容纳
 * 的Connection类型的对象数目的上限和下限、闲置连接超时时间等；然后每当应用程序请求数据库连接时，先判断池中有无空闲的连接，
 * 如有，即返回这个对象，如没有，则新建一个连接对象，并放入连接池中进行管理
 */
public class Multiton {
    //不一定存入一个Map中，但自己的多个实例必须自己创建，自己管理，自己提供
    private static HashMap<String, Multiton> multitonHashMap = new HashMap<>() {
        {
            multitonHashMap.put("Multiton_1", new Multiton());
            multitonHashMap.put("Multiton_2", new Multiton());
            multitonHashMap.put("Multiton_3", new Multiton());
        }
    };

    /**
     * 私有化无参构造函数，使外界不能直接new实例
     */
    private Multiton() {
    }


    public static Multiton getInstance(String key) {
        return multitonHashMap.get(key);
    }


}
