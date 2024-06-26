package com.company;
import java.util.*;


public class lc_456_132_Pattern {
    //method 1 is faster
    public static boolean find132pattern(int[] nums) {
        if (nums.length < 3)
            return false;
        int[] min = new int[nums.length];
        min[0] = nums[0];
        for (int i = 1; i < nums.length; i++)
            min[i] = Math.min(min[i - 1], nums[i]);
        for (int j = nums.length - 1, k = nums.length; j >= 0; j--) {
            if (nums[j] > min[j]) {
                while (k < nums.length && nums[k] <= min[j])
                    k++;
                if (k < nums.length && nums[k] < nums[j])
                    return true;
                nums[--k] = nums[j];
            }
        }
        return false;
    }
    public static boolean find132pattern2(int[] nums) {
        // 1. use a fake minR, scan from right, stack.push(nums[i])
        // 2. once get one nums[i] > stack nums[i] peek, get the historical max stack
        // 3.if next nums[i] < stack peek, return true, else continue checks nums[i] > stack peek
        //总之就是先找到右面有个数能比自己小，然后下一轮

        Deque <Integer> stack = new LinkedList<>();

        int min2 = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--){
            if (nums[i] < min2){
                return true;
            }else{
                while(!stack.isEmpty() && nums[i] > stack.peek()){
                    min2 = Math.max(min2, stack.poll());

                }
            }

            stack.push(nums[i]);

        }
        return false;

    }



    public static void main(String[] args){
        int[] nums1 = new int[]{0,1,2,4,5,7};
        //int[] nums2 = new int[]{2,2,3};
        int val = 2;
        int ladders = 1;
        boolean result = find132pattern(nums1);
        //System.out.println(Arrays.toString(result));
        System.out.println((result));
    }



    public static void print2D(int mat[][])
    {
        // Loop through all rows
        for (int[] row : mat)

            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
    }
}
