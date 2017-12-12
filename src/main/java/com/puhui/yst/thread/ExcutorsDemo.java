package com.puhui.yst.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcutorsDemo {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.submit(new MyRunnable1() {
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });

        pool.submit(new MyRunnable1() {
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        });
        pool.shutdown();
    }
}
