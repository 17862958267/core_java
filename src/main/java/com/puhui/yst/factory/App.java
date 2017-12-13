package com.puhui.yst.factory;

import org.junit.Test;

public class App {
    @Test
    public void test() {
        Factory factory = new Factory();
        Sender sender = factory.produce("mail");
        sender.send();
        MultiFactory mfactory = new MultiFactory();
        Sender sender1 = mfactory.produceMail();
        Sender sender2 = mfactory.produceSms();
        sender1.send();
        sender2.send();
    }
}
