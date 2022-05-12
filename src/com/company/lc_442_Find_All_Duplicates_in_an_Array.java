package com.company;
import java.util.*;

public class lc_442_Find_All_Duplicates_in_an_Array {

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for (int num : nums) {
            if (nums[Math.abs(num) - 1] < 0) { // seen before
                ans.add(Math.abs(num));
            }
            nums[Math.abs(num) - 1] *= -1;
        }

        return ans;
    }

    public static void main(String[] args){
        int[] intArray = new int[]{4, 3, 7, 7, 8, 1, 3, 1};
        int target = 5;
        List<Integer> result =  findDuplicates(intArray);
        System.out.println(Arrays.toString(result.toArray()));
    }
}
