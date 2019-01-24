package com.zk.springboot.exercise.design.singleton;

/**
 * @author zpf
 * @date 2019/1/23 10:36
 * 设计模式的作用：解耦，复用，减少代码的开发量。为了后期易于维护。
 * https://blog.csdn.net/liliping28/article/details/80916316
 *
 *
 * 单例模式（单/多线程都可用）
 * 而所谓静态就是指在编译后所分配的内存会一直存在，直到程序退出内存才会释放这个空间
 *
 *
 */
public class Singleton {
    /* 私有构造方法，防止被实例化 */
    private Singleton() {
    }

    /* 此处使用一个内部类来维护单例 */
    private static class SingletonFactory {
        private static Singleton instance = new Singleton();

        /* 获取实例 */
        public static Singleton getInstance() {
            return SingletonFactory.instance;
            /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
        }
    }
}
























