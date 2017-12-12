package com.puhui.yst.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class SendDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        while ((line = br.readLine()) != null) {
            if (line.equals("886")) {
                break;
            }
            byte[] bys = line.getBytes();
            DatagramPacket dp
                    = new DatagramPacket(bys, bys.length, InetAddress.getByName("127.0.0.1"), 12345);
            ds.send(dp);
        }
    }
}
