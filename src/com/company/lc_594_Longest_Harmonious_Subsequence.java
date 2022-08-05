package com.company;
import java.util.*;

public class lc_594_Longest_Harmonious_Subsequence {
    public static int findLHS(int[] nums) {
        HashMap < Integer, Integer > map = new HashMap < > ();
        int res = 0;
        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(map);
        for (int key: map.keySet()) {
            if (map.containsKey(key + 1))
                res = Math.max(res, map.get(key) + map.get(key + 1));
        }
        return res;
    }
    public static void main(String[] args){
        int[] intArray = new int[]{1,3,2,2,5,2,3,7};
        int target = 5;
        int result = findLHS(intArray);
        System.out.println((result));
    }

}
