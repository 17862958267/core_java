package com.puhui.yst.socket;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveDemo {
    @Test
    public void test() throws IOException {
        DatagramSocket ds = new DatagramSocket(12345);
        while (true) {
            //创建一个包裹
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);
            //接受数据
            ds.receive(dp);
            //解析数据
            String ip = dp.getAddress().getHostAddress();
            String s = new String(dp.getData(), 0, dp.getLength());
            System.out.println("from " + ip + " data is : " + s);
        }

    }
}
