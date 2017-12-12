package com.puhui.yst.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    @Test
    public void test() {
        Collection<Integer> c = new ArrayList<Integer>();
        c.add(1);
        c.add(2);
        c.add(3);
        System.out.println(c);
        System.out.println(c.size());
    }
}
