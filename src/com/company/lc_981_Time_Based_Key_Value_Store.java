package com.company;
import java.util.*;
public class lc_981_Time_Based_Key_Value_Store {
    HashMap<String, TreeMap<Integer, String>> timeMap;

    public void TimeMap() {
        timeMap = new HashMap<String, TreeMap<Integer, String>>();
    }

    public void set(String key, String value, int timestamp) {
        timeMap.putIfAbsent(key, new TreeMap<Integer, String>());
        timeMap.get(key).put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        if(timeMap.get(key) == null) return "";

        Map.Entry<Integer, String> res = timeMap.get(key).floorEntry(timestamp);
        return res == null ? "" : res.getValue();
    }
}
