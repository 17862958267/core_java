package com.puhui.yst.reflect;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * 利用反射机制可以干任何事情
 */
public class ArrayListDemo {
    @Test
    public void test() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(10);
        Class c = array.getClass();
        Method m = c.getMethod("add", Object.class);
        m.invoke(array, "hello");
        m.invoke(array, "java");
        System.out.println(array);
    }
}
