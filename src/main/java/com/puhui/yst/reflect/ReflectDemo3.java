package com.puhui.yst.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * 通过反射获取成员变量并使用
 */
public class ReflectDemo3 {
    @Test
    public void test() throws Exception {
        Class clazz = Class.forName("com.puhui.yst.reflect.Person");
        Constructor c = clazz.getConstructor();
        Object obj = c.newInstance();
        Field address = clazz.getField("address");
        address.set(obj, "南京");
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(obj, "孙中山");
        Field ageField = clazz.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(obj, 27);
        System.out.println(obj);
    }
}
