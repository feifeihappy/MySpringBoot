package com.zk.springboot.exercise.design.singleton;

/**
 * @author zpf
 * @date 2019/1/23 10:50
 * 单线程
 * 单例模式
 */
public class SingletonB {


    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static SingletonB instance = null;

    /* 私有构造方法，防止被实例化 */
    private SingletonB() {
    }

    /* 静态工程方法，创建实例 */
    public static SingletonB getInstance() {
        if (instance == null) {
            instance = new SingletonB();
        }
        return instance;
    }
    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
    public Object readResolve() {
        return instance;
    }
}
















