package com.puhui.yst.socket;

import org.junit.Test;

import java.net.InetAddress;

public class InetAddressDemo {
    @Test
    public void test() throws Exception {
        InetAddress ad = InetAddress.getByName("192.168.0.100");
        String name = ad.getHostName();
    }
}
