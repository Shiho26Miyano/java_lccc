package com.company;
import java.util.*;
public class lc_451_Sort_Characters_By_Frequency {
    public  static String frequencySort(String s) {
        // create hashmap char: freq k-v pairs
        Map<Character, Integer> map = new HashMap();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        // create empty decending Map.Entry List, sort the list
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (o1, o2) -> (o2.getValue() - o1.getValue()));
        //create StringBuilder, insert Map.Entry key to the sb
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : list) {
            for (int i = 0; i < entry.getValue(); i++) {
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        int[] intArray = new int[]{2,2,5,5,5,5,2,6,3,4,2,5,6,7};
        int target = 2;
        String s = "tree";
        String result = frequencySort(s);
        System.out.println(result);
    }

}
