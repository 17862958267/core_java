package com.puhui.yst.thread;

public class TicketSell1 implements Runnable {
    private static int tickets = 500;


    public void run() {
        while (true) {
            if (tickets > 0) {
                System.out.println(Thread.currentThread().getName() + "正在出售第" + (tickets--) + "张票");
            }
        }
    }
}
