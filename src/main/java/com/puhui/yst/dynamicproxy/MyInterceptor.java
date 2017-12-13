package com.puhui.yst.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInterceptor implements InvocationHandler {
    //目标类
    private Object target;

    public MyInterceptor(Object target) {
        this.target = target;
    }

    /**
     * @param proxy
     * @param method 目标方法
     * @param args   目标方法的参数
     * @return
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //切面方法
        System.out.println("aaaa");
        //调用目标类的目标方法
        method.invoke(target, args);
        //切面方法
        System.out.println("bbb");
        return null;
    }
}
