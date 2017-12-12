package com.puhui.yst.thread;

public class TicketSell3 implements Runnable {
    private static int tickets = 500;
    public void run() {
        while (true) {
            if (tickets > 0) {
                // 为了模拟更真实的场景，我们稍作休息
                try {
                    //t1进来了并休息，t2进来了并休息，t3进来了并休息，
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在出售第"
                        + (tickets--) + "张票");
                //窗口1正在出售第1张票,tickets=0
                //窗口2正在出售第0张票,tickets=-1
                //窗口3正在出售第-1张票,tickets=-2
            }
        }
    }
}

