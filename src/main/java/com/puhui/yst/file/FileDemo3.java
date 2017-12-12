package com.puhui.yst.file;

import org.junit.Test;

import java.io.File;

/*
 * 判断f盘目录下是否有.jpg的文件
 */
public class FileDemo3 {
    @Test
    public void test() {
        File file = new File("f:\\");
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                if (f.getName().endsWith(".jpg")) {
                    System.out.println(f.getName());
                }
            }
        }
    }
}
