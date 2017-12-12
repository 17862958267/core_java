package com.puhui.yst.set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    @Test
    public void test() {
        Set<String> set = new HashSet<String>();
        set.add("哈哈");
        set.add("无奈");
        set.add("大数据仓库");
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("hello".hashCode());
        System.out.println("hello".hashCode());
        System.out.println("world".hashCode());
    }
}
