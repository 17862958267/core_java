package com.puhui.yst.thread;

import com.puhui.yst.generic.Object;

public class TicketSell4 implements Runnable {
    private static int tickets = 1000;
    private Object obj = new Object();

    public void run() {
        while (true) {
            synchronized (obj) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()
                            + "正在出售第" + (tickets--) + "张票");
                }
            }
        }

    }
}
