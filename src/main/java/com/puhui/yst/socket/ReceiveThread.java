package com.puhui.yst.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveThread implements Runnable {
    private DatagramSocket ds;

    public ReceiveThread(DatagramSocket ds) {
        this.ds = ds;
    }

    public void run() {
        try {
            while (true) {
                byte[] bys = new byte[1024];
                DatagramPacket dp = new DatagramPacket(bys, bys.length);
                ds.receive(dp);
                String ip = dp.getAddress().getHostAddress();
                byte[] bys1 = dp.getData();
                int length = dp.getLength();
                String s = new String(bys1, 0, length);
                System.out.println("from" + ip + "data is :" + s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ds.close();
        }

    }
}
