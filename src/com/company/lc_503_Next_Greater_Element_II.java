package com.company;
import java.util.*;
public class lc_503_Next_Greater_Element_II {
    public static int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int[] res = new int[nums.length];
        for (int cnt = 0; cnt < 2; cnt++) {
            for (int i = 0; i < nums.length; i++) {
                while (!st.isEmpty() && nums[i] > nums[st.peek()]) res[st.pop()] = nums[i];
                if (cnt == 0) st.push(i);
            }
        }
        while (!st.isEmpty()) res[st.pop()] = -1;
        return res;
    }
    public static void main(String[] args){
        int[] nums1 = new int[]{1,2,1};
        int[] nums2 = new int[]{1,3,4,2};
        //int[] nums2 = new int[]{2,2,3};
        int val = 2;
        int ladders = 1;
        int[] result = nextGreaterElements(nums1);
        //System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result));
    }
}
