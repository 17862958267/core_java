package com.puhui.yst.thread;

import org.junit.Test;

public class DieLockDemo {
    @Test
    public void test() {
        DieLock dl1 = new DieLock(true);
        DieLock dl2 = new DieLock(false);
        dl1.start();
        dl2.start();
    }
}
