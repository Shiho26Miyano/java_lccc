package com.company;
import java.util.*;

public class lc_1759_Count_Number_of_Homogenous_Substrings {
    public static int countHomogenous(String s) {
        int count = 0, res = 0, cur = 0, mod = 1_000_000_007;

        for (int i = 0; i < s.length(); i++){
            count = s.charAt(i) == cur ? count + 1 : 1;
            cur = s.charAt(i);
            res = (res + count) % mod;

        }
        return res;
    }

    public static void main(String[] args){
        int[] nums1 = new int[]{3,1,2,4};
        int[] nums2 = new int[]{1,3,4,2};
        String text = "abbccaa";
        int val = 2;
        int ladders = 1;
        int result = countHomogenous(text);
        //System.out.println(Arrays.toString(result));
        System.out.println(result);
    }

}
