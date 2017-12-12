package com.puhui.yst.io;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {
    @Test
    public void test() {
        FileOutputStream out = null;
        try {
            out = new FileOutputStream("f:\\demo\\a.txt");
            out.write("hi,io".getBytes());
            out.write("hello,io".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    @Test
    public void test1() {
        FileInputStream in = null;
        try {
            in = new FileInputStream("f:\\demo\\a.txt");
            int bys = 0;
            while ((bys = in.read()) != -1) {
                char c = (char) bys;
                System.out.println(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test2() {
        FileInputStream in = null;
        try {
            in = new FileInputStream("f:\\demo\\a.txt");
            byte[] bys = new byte[1024];
            int len = 0;
            while ((len = in.read(bys)) != -1) {
                System.out.println(new String(bys, 0, len));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
