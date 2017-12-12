package com.puhui.yst.thread;

public class MyThread1 extends Thread {
    public MyThread1() {
    }

    public MyThread1(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("哈哈");
    }


}
