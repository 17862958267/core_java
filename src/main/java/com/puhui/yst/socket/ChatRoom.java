package com.puhui.yst.socket;

import com.sun.org.apache.regexp.internal.RE;
import org.junit.Test;

import java.net.DatagramSocket;

public class ChatRoom {
    @Test
    public void test() throws Exception {
        DatagramSocket send = new DatagramSocket();
        DatagramSocket receive = new DatagramSocket(10004);
        SendThread st = new SendThread(send);
        ReceiveThread rt = new ReceiveThread(receive);
        Thread t1 = new Thread(st);
        Thread t2 = new Thread(rt);
        t1.start();
        t2.start();
    }
}
