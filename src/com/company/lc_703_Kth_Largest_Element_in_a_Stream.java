package com.company;
import java.util.*;
import java.util.PriorityQueue;
public class lc_703_Kth_Largest_Element_in_a_Stream {
    private static int k;
    private PriorityQueue<Integer> miniheap;


    public static PriorityQueue<Integer> lc_703_Kth_Largest_Element_in_a_Stream(int k, int[] nums) {

        PriorityQueue<Integer> miniheap = new PriorityQueue<>();

        for (int num: nums) {
            miniheap.offer(num);
        }

        while (miniheap.size() > k) {
            miniheap.poll();
        }

        return miniheap;
    }

    public static int adda(int val, PriorityQueue<Integer> miniheap) {
        miniheap.offer(val);
        if (miniheap.size() > k) {
            miniheap.poll();
        }

        return miniheap.peek();
    }


    public static void main(String[] args){
        int[] nums = new int[]{4, 5, 8, 2};
        int k = 3;
        //String t = "(()(()))";
        //first function
        PriorityQueue<Integer> KthLargest = lc_703_Kth_Largest_Element_in_a_Stream(k ,nums);
        System.out.println(KthLargest);
        //second function
        //int result = adda(3, KthLargest);
        System.out.println(adda(3, KthLargest));
        System.out.println(KthLargest);
        System.out.println(adda(5, KthLargest));
        System.out.println(KthLargest);
        System.out.println(adda(10, KthLargest));
        System.out.println(KthLargest);
        System.out.println(adda(9, KthLargest));
        System.out.println(KthLargest);
        System.out.println(adda(15, KthLargest));
        System.out.println(KthLargest);
    }
}

class KthLargest {
    private static int k;
    private PriorityQueue<Integer> miniheap;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        miniheap = new PriorityQueue<>();

        for (int num: nums) {
            miniheap.offer(num);
        }

        while (miniheap.size() > k) {
            miniheap.poll();
        }
    }

    public int add(int val) {
        miniheap.offer(val);
        if (miniheap.size() > k) {
            miniheap.poll();
        }

        return miniheap.peek();
    }
}