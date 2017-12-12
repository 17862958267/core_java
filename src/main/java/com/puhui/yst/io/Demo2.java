package com.puhui.yst.io;

import org.junit.Test;
import sun.nio.cs.ext.GBK;

import java.awt.peer.SystemTrayPeer;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Demo2 {
    @Test
    public void test() throws Exception {
        FileInputStream in = null;
        try {
            in = new FileInputStream("f:\\d.txt");
            byte[] bys = new byte[1024];
            int len = 0;
            while ((len = in.read(bys)) != -1) {
                System.out.println(new String(bys, 0, len, "GBK"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            in.close();
        }
    }

    //一次新读取一个字符
    @Test
    public void test2() throws Exception {
        InputStreamReader isr
                = new InputStreamReader(new FileInputStream("f:\\d.txt"), "GBK");
        int ch = 0;
        while ((ch = isr.read()) != -1) {
            System.out.println((char) ch);
        }
    }

    //读取字符数组
    @Test
    public void test3() throws Exception {
        InputStreamReader isr
                = new InputStreamReader(new FileInputStream("f:\\d.txt"), "GBK");
        char[] chars = new char[1024];
        int len = 0;
        while ((len = isr.read(chars)) != -1) {
            System.out.println(new String(chars, 0, len));
        }
    }
}
