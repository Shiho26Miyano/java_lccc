package com.company;
import java.util.*;

public class lc_146_LRU_Cache {
    HashMap<Integer,Integer> cache;
    public void LRUCache(int capacity) {
        cache = new LinkedHashMap<>(capacity, 0.75f, true){
            protected boolean removeEldestEntry(Map.Entry eldest)
            {
                return size() > capacity;
            }
        };
    }

    public int get(int key) {
        if(cache.containsKey(key)){
            return cache.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        cache.put(key, value);
    }
}
