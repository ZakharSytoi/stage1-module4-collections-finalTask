package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        HashMap<Integer, Set<String>> result = new HashMap<>();
        for (String i: sourceMap.keySet()){
            if(!result.containsKey(i.length())){
                result.put(i.length(), new HashSet<>());
                result.get(i.length()).add(i);
            }else {
                result.get(i.length()).add(i);
            }
        }
    return result;
    }
}
