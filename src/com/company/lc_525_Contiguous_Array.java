package com.company;
import java.util.*;


public class lc_525_Contiguous_Array {

    public static int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int maxlen = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] == 1 ? 1 : -1);
            if (map.containsKey(count)) {
                maxlen = Math.max(maxlen, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxlen;
    }

    public static void main(String[] args){
        int[] intArray = new int[]{0, 1};
        int target = 5;
        int result = findMaxLength(intArray);
        System.out.println(result);
    }

}
