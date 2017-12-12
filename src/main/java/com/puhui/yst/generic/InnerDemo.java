package com.puhui.yst.generic;

public class InnerDemo {
    public static void main(String[] args) {
        Inner<String> str = new InnerImpl<String>();
        str.show("哈哈");

        Inner<Integer> i = new InnerImpl<Integer>();
        i.show(1);
    }
}
