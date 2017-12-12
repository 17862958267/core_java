package com.puhui.yst.recursion;

import org.junit.Test;

/**
 * 求n的阶乘  5！=1*2*3*4*5 = 5*4！
 */
public class Demo1 {
    public static int recursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * recursion(n - 1);
        }
    }


    @Test
    public void test(){
        System.out.println(recursion(5));
    }
}

