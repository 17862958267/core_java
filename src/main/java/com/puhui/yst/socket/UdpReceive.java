package com.puhui.yst.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpReceive {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(10086);
        byte[] bys = new byte[1024];
        int length = bys.length;
        DatagramPacket dp = new DatagramPacket(bys, length);
        ds.receive(dp);
        //解析数据
        InetAddress address = dp.getAddress();
        String ip = address.getHostAddress();
        byte[] bys1 = dp.getData();
        int len = dp.getLength();
        String data = new String(bys1, 0, len);
        System.out.println(ip + "传递的数据是:" + data);
        ds.close();
    }
}
