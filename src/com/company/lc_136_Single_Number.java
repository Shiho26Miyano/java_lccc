package com.company;
import java.util.*;
public class lc_136_Single_Number {
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hash_table = new HashMap<>();

        for (int i : nums) {
            hash_table.put(i, hash_table.getOrDefault(i, 0) + 1);
        }
        for (int i : nums) {
            if (hash_table.get(i) == 1) {
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        int[] intArray = new int[]{2,2,1};
        int target = 5;
        int result = singleNumber(intArray);
        System.out.println((result));
    }
}
