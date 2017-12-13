package com.puhui.yst.decrator;

import org.junit.Test;

import java.awt.peer.SystemTrayPeer;

/**
 * io流中大量运用了装饰模式，增强某个类的功能
 */
public class App {
    @Test
    public void test() {
        MessageBoardHandler mb = new MessageBoard();
        String content = mb.filter("一定要学好装饰模式");
        System.out.println(content);
        mb = new HtmlFilter(new SensitiveFilter(new MessageBoard()));
        content = mb.filter("一定要学好装饰模式");
        System.out.println(content);
    }
}
