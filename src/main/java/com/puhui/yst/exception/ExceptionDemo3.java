package com.puhui.yst.exception;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo3 {
    @Test
    public void test() {
        String s = "2017-11-20";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = null;
        try {
            d = sdf.parse(s);
        } catch (ParseException e) {
            System.out.println("时间解析异常");
            //jvm退出
            // System.exit(0);
        } finally {
            System.out.println("代码执行了");
        }

        System.out.println(d);

    }
}
