package com.puhui.yst.socket;

import org.junit.Test;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReceiveDemo {
    @Test
    public void test() throws Exception {
        DatagramSocket ds = new DatagramSocket(10084);
        while (true) {
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);
            ds.receive(dp);
            //解析数据
            String ip = dp.getAddress().getHostAddress();
            byte[] bys1 = dp.getData();
            int length = dp.getLength();
            String s = new String(bys1, 0, length);
            System.out.println("from " + ip + " data is : " + s);
        }
    }
}
