package com.company;
import java.util.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class lc_1046_Last_Stone_Weight {
    public static int lastStoneWeight(int[] stones) {

        // Insert all the stones into a Max-Heap.
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        for (int stone: stones) {
            heap.add(stone);
        }

        // While there is more than one stone left, we need to remove the two largest
        // and smash them together. If there is a resulting stone, we need to put into
        // the heap.
        while (heap.size() > 1) {
            int stone1 = heap.remove();
            int stone2 = heap.remove();
            if (stone1 != stone2) {
                heap.add(stone1 - stone2);
            }
        }

        // Check whether or not there is a stone left to return.
        return heap.isEmpty() ? 0 : heap.remove();
    }


    public static void main(String[] args){
        int[] intArray = new int[]{2,7,4,1,8,1};
        //int target = 5;
        int result = lastStoneWeight(intArray);
        System.out.println(result);
    }
}
