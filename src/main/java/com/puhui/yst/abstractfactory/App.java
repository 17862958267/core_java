package com.puhui.yst.abstractfactory;

import org.junit.Test;

/**
 * 抽象工厂模式，创建更多的工厂类，更好的可扩展性与满足开闭原则
 */
public class App {
    @Test
    public void test() {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}
