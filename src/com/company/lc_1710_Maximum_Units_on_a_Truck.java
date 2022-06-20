package com.company;
import java.util.*;

public class lc_1710_Maximum_Units_on_a_Truck {

    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        PriorityQueue<int[]> myQueue = new PriorityQueue<>((a, b)->b[1] - a[1]);
        for (int[] array: boxTypes){
            System.out.println(Arrays.toString(array));
        }

        myQueue.addAll(Arrays.asList(boxTypes));
        int unitCount = 0;
        while (!myQueue.isEmpty() && truckSize >=0 ) {
            int[] top = myQueue.poll();
            int boxLast = Math.min(truckSize, top[0]);
            unitCount += boxLast * top[1];
            truckSize -= boxLast;
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
