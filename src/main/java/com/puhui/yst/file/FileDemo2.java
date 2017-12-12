package com.puhui.yst.file;

import org.junit.Test;

import java.io.File;

public class FileDemo2 {
    @Test
    public void test() {
        File file = new File("f:");
        String[] files = file.list();
        for (String s : files) {
            System.out.println(s);
        }

        File[] file1 = file.listFiles();
        for (File f : file1) {
            String name = f.getName();
            System.out.println(name);
        }
    }
}
