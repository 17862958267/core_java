package com.puhui.yst.thread;

import org.junit.Test;

public class MyThreadDemo {
    @Test
    public void test() {
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();
        my1.start();
        my2.start();
    }

}
