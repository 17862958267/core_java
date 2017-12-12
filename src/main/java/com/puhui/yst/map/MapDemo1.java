package com.puhui.yst.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
    @Test
    public void test() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "haha");
        map.put("b", "xixi");
        map.put("c", "gagg");
        map.put("d", "jj");
        Set<String> set = map.keySet();
        for (String key : set) {
            String value = map.get(key);
            System.out.println(key + "---" + value);
        }
    }
}

