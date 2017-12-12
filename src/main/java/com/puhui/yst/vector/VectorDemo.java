package com.puhui.yst.vector;

import org.junit.Test;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    @Test
    public void test() {
        Vector v = new Vector();
        v.add("hello");
        v.add("world");
        v.add("java");
        for (int i = 0; i < v.size(); i++) {
            String s = (String) v.elementAt(i);
            System.out.println(s);
        }
        System.out.println("============");
        Enumeration en = v.elements();
        while (en.hasMoreElements()) {
            String s = (String) en.nextElement();
            System.out.println(s);
        }
    }
}
