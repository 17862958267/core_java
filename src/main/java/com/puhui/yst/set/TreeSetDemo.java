package com.puhui.yst.set;

import org.junit.Test;

import java.util.TreeSet;

public class TreeSetDemo {
    @Test
    public void test() {
        TreeSet<Integer> tree = new TreeSet<Integer>();
        tree.add(1);
        tree.add(18);
        tree.add(3);
        tree.add(6);
        tree.add(13);

        for (Integer i : tree) {
            System.out.println(i);
        }
    }
}
