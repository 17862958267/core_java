package com.puhui.yst.socket;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpSendDemo1 {
    @Test
    public void test() throws Exception {
        DatagramSocket ds = new DatagramSocket();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while ((line = br.readLine()) != null) {
            if (line.equals("886")) {
                break;
            }
            byte[] bys = line.getBytes();
            int length = bys.length;
            InetAddress address = InetAddress.getByName("127.0.0.1");
            int port = 10084;
            DatagramPacket dp = new DatagramPacket(bys, length, address, port);
            ds.send(dp);
        }
    }
}
