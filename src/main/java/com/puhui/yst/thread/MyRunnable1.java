package com.puhui.yst.thread;

public class MyRunnable1 implements Runnable {

    public void run() {
        for (int x = 0; x < 100; x++) {
            System.out.println(Thread.currentThread().getName() + ":" + x);
        }
    }
}
