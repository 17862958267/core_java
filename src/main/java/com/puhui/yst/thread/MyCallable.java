package com.puhui.yst.thread;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {


    public Object call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName());
        }
        return null;
    }
}
