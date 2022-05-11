package com.company;
import java.util.*;

public class lc_442_Find_All_Duplicates_in_an_Array {

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                ans.add(num);
            } else {
                seen.add(num);
            }
        }

        return ans;
    }
    public static void main(String[] args){
        int[] intArray = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        int target = 5;
        List<Integer> result =  findDuplicates(intArray);
        System.out.println(Arrays.toString(result.toArray()));
    }
}
