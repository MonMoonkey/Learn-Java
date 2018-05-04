package priv.monkey.learn.java.design_pattern.creational.singleton;

/**
 * 1. 饿汉式，线程安全
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    //让构造函数为private，不会被实例化
    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}

/**
 * 2. 懒汉式，线程不安全
 **/
/*
public class Singleton {

    private static Singleton instance;
    private Singleton (){}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
*/


/**
 * 3. 懒汉式，线程安全
 */
/*
public class Singleton {
    private static Singleton instance;
    private Singleton (){}
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
*/


/**
 * 4. 静态内部类
 */
/*
public class Singleton {
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    private Singleton (){}
    public static final Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
*/

/**
 * 5. 双重校验锁
 **/
/*
public class Singleton {
    private volatile static Singleton singleton;
    private Singleton (){}
    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
*/

/**
 * 6. 枚举
 */
/*
public enum Singleton {
    INSTANCE;
    public void whateverMethod() {
    }
}
 */

/**
 *
 */