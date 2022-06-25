package com.company;
import java.util.*;
//[[8,2,3],[4,1,3],[1,3,6],[8,4,6],[4,4,8]]
//        12
// trips[i] = [numPassengersi, fromi, toi]

public class lc_1094_Car_Pooling {

    public static boolean carPooling(int[][] trips, int capacity) {
        // create a TreeMap timestamp, stored a list of k-v pair, with [k = start/end point, passengerCount]
        Map<Integer, Integer> timestamp = new TreeMap<>();
        // sum startPassenger count based on start point;
        // sum (minus) endPassenger count based on end point;
        // fulfill the k-v pair timestamp
        for (int[] trip : trips) {
            int startPassenger = timestamp.getOrDefault(trip[1], 0) + trip[0];
            timestamp.put(trip[1], startPassenger);
            System.out.println((timestamp));
            System.out.println("break");
            int endPassenger = timestamp.getOrDefault(trip[2], 0) - trip[0];
            timestamp.put(trip[2], endPassenger);
            System.out.println((timestamp));
            System.out.println("end");
        }
        // loop sum up passenger count, check on each add/drop point whether the total count <= capacity
        int usedCapacity = 0;
        for (int passengerChange : timestamp.values()) {
            System.out.println("timestamp values");
            System.out.println(timestamp.values());
            usedCapacity += passengerChange;
            if (usedCapacity > capacity) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int[][] array = new int[][]{{8, 2, 3}, {4, 1, 3}, {1, 3, 6}, {8, 4, 6}, {4, 4, 8}};
        int target = 4;
        boolean result =  carPooling(array, target);
        System.out.println((result));
    }
}
