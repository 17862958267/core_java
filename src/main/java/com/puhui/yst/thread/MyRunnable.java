package com.puhui.yst.thread;

public class MyRunnable implements Runnable {

    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
