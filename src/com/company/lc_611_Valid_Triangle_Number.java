package com.company;
import java.util.*;

public class lc_611_Valid_Triangle_Number {
    public static int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0, n = nums.length;
        for (int i = n - 1; i >= 2; i--) {
            int l = 0, r = i - 1;
            while (l < r) {
                if (nums[l] + nums[r] > nums[i]) {
                    // it is r - l not r - 1
                    count += r - l;
                    r--;
                }
                else l++;
            }
        }
        return count;
    }
}














