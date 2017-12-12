package com.puhui.yst.generic;

public class InnerImpl<T> implements Inner<T> {


    public void show(T t) {
        System.out.println(t);
    }
}
