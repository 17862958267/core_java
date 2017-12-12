package com.puhui.yst.generic;

public class Object1ToolDemo {
    public static void main(String[] args) {
        Object1<String> ot = new Object1<String>();
        ot.setObj(new String("哈哈"));
        String s = ot.getObj();
        System.out.println(s);


        Object1<Integer> ot1 = new Object1<Integer>();
        ot1.setObj(new Integer(1));
        Integer i = ot1.getObj();
        System.out.println(i);
    }
}
