package com.puhui.yst.thread;

import org.junit.Test;

public class MyRunnableDemo {
    @Test
    public void test() {
        //创建runnable对象
        MyRunnable mr = new MyRunnable();
        //创建Thread对象,将myrunnable的实例对象作为参数传给thread
        Thread t1 = new Thread(mr, "张三");
        Thread t2 = new Thread(mr, "李四");
        t1.start();
        t2.start();
    }

}
