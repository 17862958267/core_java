package com.puhui.yst.thread;

public class TicketSell5 implements Runnable {
    private static int tickets = 100;

    public void run() {

    }


    private static synchronized void sellTicket() {
        if (tickets > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()
                    + "正在出售第" + (tickets--) + "张票 ");
        }
    }
}

