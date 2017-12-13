package com.puhui.yst.abstractfactory;

public class MailSender implements Sender {
    public void send() {
        System.out.println("this is mailSender");
    }
}
