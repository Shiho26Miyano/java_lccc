package com.company;
import java.util.*;

public class lc_496_Next_Greater_Element_I {
    public static int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }
        for (int i = 0; i < findNums.length; i++)
            findNums[i] = map.getOrDefault(findNums[i], -1);
        return findNums;
    }
    public static void main(String[] args){
        int[] nums1 = new int[]{4,1,2};
        int[] nums2 = new int[]{1,3,4,2};
        //int[] nums2 = new int[]{2,2,3};
        int val = 2;
        int ladders = 1;
        int[] result = nextGreaterElement(nums1, nums2);
        //System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result));
    }
}