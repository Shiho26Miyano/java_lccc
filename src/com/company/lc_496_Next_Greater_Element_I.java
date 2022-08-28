package com.company;
import java.util.*;

public class lc_496_Next_Greater_Element_I {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> mapper = new HashMap<>();
        Stack<Integer> stacker = new Stack<>();

        for (int num : nums2){
            while (!stacker.isEmpty() && stacker.peek() < num)
                mapper.put(stacker.pop(), num);
            stacker.push(num);


        }
        for (int i = 0; i < nums1.length; i++){
            nums1[i] = mapper.getOrDefault(nums1[i], -1);
        }
        return nums1;
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