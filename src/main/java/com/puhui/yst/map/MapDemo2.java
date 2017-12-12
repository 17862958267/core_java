package com.puhui.yst.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    @Test
    public void test() {
        Map<String,String> map = new HashMap<String, String>();
        map.put("a", "haha");
        map.put("b", "xixi");
        map.put("c", "gagg");
        map.put("d", "jj");
        Set<Map.Entry<String,String>> set = map.entrySet();
        for(Map.Entry<String,String> entry : set){
            String key = entry.getKey();
            String value =entry .getValue();
            System.out.println(key +"===="+value);
        }
    }
}
