package com.puhui.yst.io;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class StringDemo {
    @Test
    public void test() {
        String s = "我爱你中国";
        byte[] bys = s.getBytes();
        for (byte b : bys) {
            System.out.println(b);
        }
    }

    @Test
    public void test2() throws IOException {
        FileInputStream in = new FileInputStream("f:\\demo\\a.txt");
        FileOutputStream out = new FileOutputStream("f:\\c.txt");
        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = in.read(bys)) != -1) {
            out.write(bys);
        }
        in.close();
        out.close();
    }
}
