package com.puhui.yst.singleton;

/**
 * 饿汉单例模式，天生线程安全，类一旦加载，单例已经初始化完成
 */
public class HungrySingleton {
    private HungrySingleton() {
    }

    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    //静态工厂方法
    public static HungrySingleton getHungrySingleton() {
        return HUNGRY_SINGLETON;
    }

}
