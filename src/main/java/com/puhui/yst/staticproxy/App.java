package com.puhui.yst.staticproxy;

import org.junit.Test;

/**
 * 静态代理目标类与代理类都需要实现相同的接口
 */
public class App {
    @Test
    public void test() {
        //目标对象
        UserDao target = new UserDao();
        //代理对象
        UserDaoProxy proxy = new UserDaoProxy(target);
        proxy.save();
    }
}
