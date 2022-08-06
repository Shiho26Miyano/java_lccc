package com.company;
import java.util.*;

public class lc_169_Majority_Element {
    private static  Map<Integer, Integer> countNums(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        return counts;
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = countNums(nums);

        Map.Entry<Integer, Integer> majorityEntry = null;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }

        return majorityEntry.getKey();
    }

    public static void main(String[] args){
        int[] intArray = new int[]{3,2,3};
        int target = 5;
        int result = majorityElement(intArray);
        System.out.println((result));
    }
}
