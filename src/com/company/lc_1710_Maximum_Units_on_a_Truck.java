package com.company;
import java.util.*;

public class lc_1710_Maximum_Units_on_a_Truck {

    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b)->b[1] - a[1]);
        queue.addAll(Arrays.asList(boxTypes));
        int unitCount = 0;
        while (!queue.isEmpty()) {
            int[] top = queue.poll();
            int boxCount = Math.min(truckSize, top[0]);
            unitCount += boxCount * top[1];
            truckSize -= boxCount;
            if(truckSize == 0)
                break;
        }
        return unitCount;
    }
    public static void main(String[] args){
        int[][] array = new int[][]{{1, 3}, {2, 2}, {3, 1}};
        int target = 4;
        int result =  maximumUnits(array, target);
        System.out.println((result));
    }



}
