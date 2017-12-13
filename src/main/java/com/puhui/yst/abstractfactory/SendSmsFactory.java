package com.puhui.yst.abstractfactory;

public class SendSmsFactory implements Provider {
    public Sender produce() {
        return new SmsSender();
    }
}
