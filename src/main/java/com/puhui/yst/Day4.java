package com.puhui.yst;

import org.junit.Test;

public class Day4 {
    @Test
    public void test() {
        String a = new String("abc");
        String b = new String("abc");
        //true,比较内容
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
