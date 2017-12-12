package com.puhui.yst.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendThread implements Runnable {
    private DatagramSocket ds;

    public SendThread(DatagramSocket ds) {
        this.ds = ds;
    }

    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = null;
            while ((line = br.readLine()) != null) {
                if (line.equals("886")) {
                    break;
                }
                byte[] bys = line.getBytes();
                InetAddress address = InetAddress.getByName("127.0.0.1");
                int port = 1000;
                DatagramPacket dp = new DatagramPacket(bys, bys.length, address, port);
                ds.send(dp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ds.close();
        }
    }
}
