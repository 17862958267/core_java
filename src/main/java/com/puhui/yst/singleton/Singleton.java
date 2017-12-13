package com.puhui.yst.singleton;

/**
 * 静态工厂方法创建懒汉式单例模式
 */
public class Singleton {
    private static Singleton singleton = null;
    //私有化构造方法，保证不能被其他对象创建
    private Singleton() {}
    //静态工厂方法
    public static Singleton getSingleton() {
        if (singleton == null) {
            return new Singleton();
        }
        return singleton;
    }
}
