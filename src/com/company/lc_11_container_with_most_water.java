package com.company;
import java.util.*;
public class lc_11_container_with_most_water {

    public static int maxArea(int[] height) {
        int res = 0, l = 0, r = height.length - 1;
        while (l < r) {
            int area = (r - l) * Math.min(height[l], height[r]);
            res = Math.max(res, area);
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return res;
    }


    public static void main(String[] args){
        int[] intArray = new int[]{1,8,6,2,5,4,8,3,7};
        int target = 9;
        int result = maxArea(intArray);
        System.out.println((result));
    }
}
