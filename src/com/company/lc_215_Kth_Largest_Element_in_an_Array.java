package com.company;
import java.util.*;

public class lc_215_Kth_Largest_Element_in_an_Array {
    //method 1 minHeap
    public static int findKthLargest(int[] nums, int k) {
        //minHeap
        // init heap 'the smallest element first'
        PriorityQueue<Integer> heap =
                new PriorityQueue<Integer>((n1, n2) -> n1 - n2);

        // keep k largest elements in the heap
        for (int n: nums) {
            heap.add(n);
            if (heap.size() > k)
                heap.poll();
        }

        // output
        return heap.poll();
    }
    // method 2 maxHeap
    public static int findKthLargest_2(int[] nums, int k) {
        PriorityQueue<Integer>pq = new PriorityQueue<>((a,b)->b-a);
        for (int n : nums) pq.add(n);
        int totalSize = pq.size();
        while(totalSize - pq.size() < k - 1){
            pq.poll();
        }
        return pq.peek();

    }


    public static void main(String[] args){
        int[] intArray = new int[]{4,9,8,5, 2,7,5};
        int k = 5;
        int result = findKthLargest(intArray, k);
        System.out.println(result);
    }
}
