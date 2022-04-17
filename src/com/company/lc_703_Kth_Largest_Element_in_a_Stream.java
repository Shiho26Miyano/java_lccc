package com.company;

import java.util.Arrays;
import java.util.PriorityQueue;
public class lc_703_Kth_Largest_Element_in_a_Stream {
    private static int k;
    private PriorityQueue<Integer> minHeap;

    public lc_703_Kth_Largest_Element_in_a_Stream(int k, int[] nums) {
    }

    public void lc_703_Kth_Largest_Element_in_a_Stream(int k, int[] nums) {
        this.k = k;
        for(int num: nums) {
            minHeap.add(num);
        }
        minHeap = new PriorityQueue<>((a , b) -> a - b);
        while (minHeap.size() > k) {
            minHeap.poll();
        }
    }

    public int add(int val) {
        minHeap.add(val);
        if (minHeap.size() > k) {
            minHeap.poll();
        }
        return minHeap.peek();
    }


    public main(String[] args){
        int[] nums = new int[]{2,7,11,15};
        int k = 3;
        //String t = "(()(()))";
        lc_703_Kth_Largest_Element_in_a_Stream KthLargest = new lc_703_Kth_Largest_Element_in_a_Stream(k, nums);
        int s = KthLargest.add(3);
        //System.out.println(Arrays.toString(result));
        System.out.println(s);
    }
}
