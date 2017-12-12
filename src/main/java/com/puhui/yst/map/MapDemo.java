package com.puhui.yst.map;

import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    @Test
    public void test() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "jack");
        map.put("country", "china");
        map.put("sex", "man");

        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(s);
        }

        Collection<String> collection = map.values();
        for(String s1 : collection){
            System.out.println(s1);
        }

    }
}
