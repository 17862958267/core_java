package com.puhui.yst.thread;

import org.junit.Test;

public class MyThread1Demo {
    @Test
    public void test(){
        MyThread1 my1 = new MyThread1("赵云");
        MyThread1 my2 = new MyThread1("袁绍");
        my1.start();
        my2.start();
        System.out.println(Thread.currentThread().getName());
    }
}
