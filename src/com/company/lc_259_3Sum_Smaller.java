package com.company;
import java.util.*;

public class lc_259_3Sum_Smaller {
    //lc_611_Valid_Triangle_Number related
    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int count = 0, n = nums.length;
        for (int i = n - 1; i >= 2; i--){
            int l = 0, r = i - 1;
            while (l < r){
                if ((nums[l] + nums[r] + nums[i]) < target){
                    count += r - l;
                    l++;
                }else{
                    r--;
                }

            }
        }
        return count;

    }
    public int threeSumSmaller1(int[] nums, int target) {
        int count = 0;
        Arrays.sort(nums);
        int len = nums.length;

        for(int i=0; i<len-2; i++) {
            int left = i+1, right = len-1;
            while(left < right) {
                if(nums[i] + nums[left] + nums[right] < target) {
                    count += right-left;
                    left++;
                } else {
                    right--;
                }
            }
        }

        return count;
    }
}
