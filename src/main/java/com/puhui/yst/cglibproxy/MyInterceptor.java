package com.puhui.yst.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.awt.peer.SystemTrayPeer;
import java.lang.reflect.Method;

public class MyInterceptor implements MethodInterceptor {
    private Object target;

    public MyInterceptor(Object target) {
        this.target = target;
    }

    /**
     * 返回代理对象
     *
     * @return
     */
    public Object createProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(this);
        enhancer.setSuperclass(this.target.getClass());
        return enhancer.create();
    }


    /**
     * @param o
     * @param method
     * @param objects
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("aaaaaaaa");
        method.invoke(target,objects);
        System.out.println("ccccccccc");
        return null;
    }
}
