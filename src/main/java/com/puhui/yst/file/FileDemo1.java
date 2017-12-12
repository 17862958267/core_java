package com.puhui.yst.file;

import org.junit.Test;

import java.io.File;

public class FileDemo1 {
    @Test
    public void test() throws Exception{
        File file = new File("f:\\demo");
        System.out.println(file.mkdir());

        File file1 = new File("f:\\demo\\a.txt");
        System.out.println(file1.createNewFile());

        File file2 = new File("f:\\demo\\kuaihuo\\src");
        file2.mkdirs();
    }
}
