package com.puhui.yst.dynamicproxy;

import org.junit.Test;
/**
 * jdk动态代理,代理对象由jdk动态生成
 */
import java.lang.reflect.Proxy;

public class App {
    @Test
    public void test() {
        //目标对象
        TargetObject targetObject = new TargetObject();
        //拦截器
        MyInterceptor interceptor = new MyInterceptor(targetObject);
        //代理对象，调用系统方法自动生成
        /**
         * 生成的代理对象的参数
         * 目标类的类加载器
         * 目标类的所有接口
         * 自定义拦截器
         *
         */
        TargetInterface proxy =
                (TargetInterface) Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
                        targetObject.getClass().getInterfaces(),
                        interceptor);
        //代理对象调用目标对象的方法
        proxy.business();

    }
}
