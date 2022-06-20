package com.company;
import java.util.*;

public class lc_1094_Car_Pooling {

    public static boolean carPooling(int[][] trips, int capacity) {
        Map<Integer, Integer> timestamp = new TreeMap<>();
        for (int[] trip : trips) {
            int startPassenger = timestamp.getOrDefault(trip[1], 0) + trip[0];
            timestamp.put(trip[1], startPassenger);

            int endPassenger = timestamp.getOrDefault(trip[2], 0) - trip[0];
            timestamp.put(trip[2], endPassenger);
        }
        int usedCapacity = 0;
        for (int passengerChange : timestamp.values()) {
            usedCapacity += passengerChange;
            if (usedCapacity > capacity) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args){
        int[][] array = new int[][]{{2, 1, 5}, {3, 3, 7}};
        int target = 4;
        boolean result =  carPooling(array, target);
        System.out.println((result));
    }
}
