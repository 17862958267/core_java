package com.puhui.yst.generic;

public class ObjectToolDemo {
    public static void main(String[] args) {
        Object object = new Object();
        object.setObj(new Integer(10));
        Integer i = (Integer) object.getObj();
        System.out.println(i);


        object.setObj(new Integer(30));
        //类型转换异常
        String ss = (String) object.getObj();
        System.out.println(ss);
    }
}
