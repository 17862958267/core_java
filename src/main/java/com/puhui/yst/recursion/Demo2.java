package com.puhui.yst.recursion;

import org.junit.Test;

import java.awt.peer.SystemTrayPeer;
import java.io.File;

/**
 * 递归删除带内容的目录
 */
public class Demo2 {
    @Test
    public void test() {
        //封装目录
        File file = new File("f:\\demo");
        //递归实现
        deleteFolder(file);


    }

    private static void deleteFolder(File file) {
        //获取该目录下所有文件或文件夹数组
        File[] files = file.listFiles();
        if (files != null) {
            //遍历file数组得到每个文件对象
            for (File f : files) {
                if (f.isDirectory()) {
                    deleteFolder(f);
                } else {
                    System.out.println(f.getName() + "=====" + f.delete());
                }
            }
        }
    }
}





