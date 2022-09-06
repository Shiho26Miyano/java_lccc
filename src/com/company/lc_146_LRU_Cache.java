package com.company;
import java.util.*;

public class lc_146_LRU_Cache {
    private Map<Integer, Integer> map;
    private Integer capacity;

    public void LRUCache(int capacity) {
        map = new LinkedHashMap<Integer, Integer>(capacity) {
            @Override
            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > capacity;
            }
        };
        this.capacity = capacity;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Integer i = map.get(key);
            map.remove(key);
            map.put(key, i);
            return i;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (value < 0) return;

        if (map.containsKey(key)) {
            map.remove(key);
        }

        map.put(key, value);
    }
}
