package com.puhui.yst.thread;

import org.junit.Test;

public class TicketSell1Demo {
    @Test
    public void test() {
        TicketSell1 ts = new TicketSell1();
        Thread t1 = new Thread(ts, "窗口1");
        Thread t2 = new Thread(ts, "窗口2");
        Thread t3 = new Thread(ts, "窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
