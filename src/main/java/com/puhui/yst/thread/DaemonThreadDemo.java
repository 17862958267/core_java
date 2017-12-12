package com.puhui.yst.thread;

import org.junit.Test;

public class DaemonThreadDemo {

    @Test
    public void test() {
        DaemonThread dt1 = new DaemonThread();
        DaemonThread dt2 = new DaemonThread();
        dt1.setName("张飞");
        dt2.setName("关羽");
        // 设置守护线程
        dt1.setDaemon(true);
        dt2.setDaemon(true);
        dt1.start();
        dt2.start();
       // Thread.currentThread().setName("刘备");
       // for (int i = 0; i < 5; i++) {
       //     System.out.println(Thread.currentThread().getName() + ":" + i);
       // }
    }
}
