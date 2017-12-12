package com.puhui.yst.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    @Test
    public void test() {
        List list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("java");
        System.out.println(list);
        list.set(1, "javaee");
        Object[] obj = list.toArray();
        for (int i = 0; i < obj.length; i++) {
            String s = (String) obj[i];
            System.out.println(s);
        }
    }
}
