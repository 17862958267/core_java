package com.puhui.yst.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo4 {
    @Test
    public void test() throws Exception {
        Class clazz = Class.forName("com.puhui.yst.reflect.Person");
        Constructor con = clazz.getConstructor();
        Object obj = con.newInstance();
        Method m = clazz.getMethod("show");
        m.invoke(obj);
        Method m1 = clazz.getMethod("method", String.class);
        m1.invoke(obj, "hello");
        Method m2 = clazz.getDeclaredMethod("function");
        m2.setAccessible(true);
        m2.invoke(obj);
    }


}
