package com.epam.mjc.collections.map;

import java.util.*;


public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new LinkedHashMap<>();
        List<String> list = List.of(sentence.split(" "));
        Set<String> set = new HashSet<>();
        for(int i = 0; list.size()>i&&!sentence.isEmpty();i++){
            int rep = 1;
            if(!set.add(list.get(i).toLowerCase().replaceAll("[^\\w\\s]",""))){
                rep++;
            }
            String toPut = list.get(i).toLowerCase().replaceAll("[^\\w\\s]","");
            map.put(toPut,rep);
        }

        return map;
    }
}
