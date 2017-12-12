package com.puhui.yst.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * 通过反射去调用Person的构造方法
 */
public class ReflectDemo1 {
    @Test
    public void test() throws Exception {
        //获取字节码文件
        Class clazz = Class.forName("com.puhui.yst.reflect.Person");
        //获取带参数构造方法对象
        Constructor c = clazz.getConstructor(String.class, int.class, String.class);
        //通过带参数构造方法对象创建对象
        Object obj = c.newInstance("张三", 23, "北京");
        System.out.println(obj);
    }
}
