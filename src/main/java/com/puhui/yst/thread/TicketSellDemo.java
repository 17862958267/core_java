package com.puhui.yst.thread;

import org.junit.Test;

public class TicketSellDemo {

    @Test
    public void test() {
        // 创建三个线程对象
        TicketSell st1 = new TicketSell();
        TicketSell st2 = new TicketSell();
        TicketSell st3 = new TicketSell();
        // 给线程对象起名字
        st1.setName("窗口1");
        st2.setName("窗口2");
        st3.setName("窗口3");
        // 启动线程
        st1.start();
        st2.start();
        st3.start();
    }
}
