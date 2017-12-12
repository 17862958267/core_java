package com.puhui.yst.thread;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyCallableDemo {
    @Test
    public void test() {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.submit(new MyCallable());
        pool.submit(new MyCallable());
        pool.shutdown();
    }
}
