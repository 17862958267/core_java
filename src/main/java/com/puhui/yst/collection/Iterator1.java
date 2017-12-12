package com.puhui.yst.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterator1 {
    @Test
    public void test() {
        Collection c = new ArrayList();
        c.add("张三");
        c.add("李四");
        c.add("王五");
        Iterator it = c.iterator();
        while (it.hasNext()) {
            String  str = (String) it.next();
            System.out.println(str);
        }
    }
}
