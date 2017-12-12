package com.puhui.yst.generic;

import org.junit.Test;

public class Object2ToolDemo {
    @Test
    public void test() {
        Object2 obj = new Object2();
        obj.show("hello");
        obj.show(true);
        obj.show(1);
        obj.show('哈');
    }
}
