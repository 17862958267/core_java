package com.puhui.yst.jdk5news;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("hi");
        list.add("阶");
        list.add("䖽");

       // Iterator<String> it = list.iterator();
       // while (it.hasNext()) {
       //     String s = it.next();
       //     System.out.println(s);
       // }

        for(String s : list){
            System.out.println(s);
        }
    }
}
