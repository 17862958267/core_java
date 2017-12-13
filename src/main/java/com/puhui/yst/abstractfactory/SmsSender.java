package com.puhui.yst.abstractfactory;

public class SmsSender implements Sender {
    public void send() {
        System.out.println("this is smsSender");
    }
}
