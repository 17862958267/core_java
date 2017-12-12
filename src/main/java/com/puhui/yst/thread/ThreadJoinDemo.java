package com.puhui.yst.thread;

import org.junit.Test;

public class ThreadJoinDemo {

    @Test
    public void test() {
        ThreadJoin tj1 = new ThreadJoin();
        ThreadJoin tj2 = new ThreadJoin();
        ThreadJoin tj3 = new ThreadJoin();
        tj1.setName("李渊");
        tj2.setName("李世名");
        tj3.setName("李元霸");
        tj1.start();
        try {
            tj1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tj2.start();
        tj3.start();

    }
}
