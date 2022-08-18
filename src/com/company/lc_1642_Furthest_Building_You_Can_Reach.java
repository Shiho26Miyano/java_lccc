package com.company;
import java.util.*;

public class lc_1642_Furthest_Building_You_Can_Reach {
    public static int furthestBuilding(int[] A, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < A.length - 1; i++) {
            int d = A[i + 1] - A[i];
            if (d > 0)
                pq.add(d);
            if (pq.size() > ladders)
                bricks -= pq.poll();
            if (bricks < 0)
                return i;
        }
        return A.length - 1;
    }
    public static void main(String[] args){
        int[] nums1 = new int[]{4,2,7,6,9,14,12};
        //int[] nums2 = new int[]{2,2,3};
        int val = 5;
        int ladders = 1;
        int result =  furthestBuilding(nums1, val, ladders);
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
