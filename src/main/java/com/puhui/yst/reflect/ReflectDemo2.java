package com.puhui.yst.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class ReflectDemo2 {
    @Test
    public void test() throws Exception {
        //获取字节码文件
        Class clazz = Class.forName("com.puhui.yst.reflect.Person");
        //获取私有构造方法对象
        Constructor c = clazz.getDeclaredConstructor(String.class);
        //暴力访问
        c.setAccessible(true);
        Object obj = c.newInstance("张无忌");
        System.out.println(obj);
    }
}
