package com.epam.mjc.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> map = new LinkedHashMap<>();
        System.out.println(sourceMap.get(1));
        for(int i =1; sourceMap.size()+1>i;i++){
            if(sourceMap.get(i)==null){continue;}
            map.put(sourceMap.get(i),i);
        }
        return map;
    }
}
