package com.puhui.yst.generic;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {
    @Test
    public void test() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("HELLO");
        list.add("world");
        list.add("java");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }
}
