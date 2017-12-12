package com.puhui.yst.exception;

import org.junit.Test;

public class ExceptionDemo1 {

    @Test
    public void test() {
        int a = 10;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("算数异常");
        }
        System.out.println("over");

    }
}
