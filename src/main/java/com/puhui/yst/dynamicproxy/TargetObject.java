package com.puhui.yst.dynamicproxy;

/**
 * 目标对象也就是被代理的对象必须实现接口
 */
public class TargetObject implements TargetInterface {
    public void business() {
        System.out.println("business");
    }
}
