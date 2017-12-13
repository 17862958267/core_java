package com.puhui.yst.singleton;

/**
 * 性能与效率兼备的懒汉式单例模式,采用静态内部类来实现,线程安全也避免了同步锁带来的性能下降
 */
public class SafeSingleton {
    private static class lazyHolder {
        private static final SafeSingleton instance = new SafeSingleton();
    }
    private SafeSingleton() {
    }
    public static final SafeSingleton getInstance() {
        return lazyHolder.instance;
    }
}
