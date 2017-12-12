package com.puhui.yst.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    @Test
    public void test() {
        Collection c = new ArrayList();
        c.add("hello");
        c.add("java");
        c.add("world");
        System.out.println(c.toArray());
        System.out.println("===========");
        Object[] obj = c.toArray();
        for (int i = 0; i < obj.length; i++) {
            String s = (String) obj[i];
            System.out.println(s);
        }
    }
}
