package com.puhui.yst.cglibproxy;

import org.junit.Test;

/**
 * 基于cglib的动态代理，spring的实现原理,比jdk少实现一个接口，因为反悔的代理对象是目标的对象的子类
 * 而jdk产生的代理对象与目标对象实现的是一个公共接口
 */
public class App {
    @Test
    public void test() {
        //目标对象
        TargetObject target = new TargetObject();
        //拦截器
        MyInterceptor interceptor = new MyInterceptor(target);

        //生成代理对象
        TargetObject proxy = (TargetObject) interceptor.createProxy();
        proxy.business();
    }

}
