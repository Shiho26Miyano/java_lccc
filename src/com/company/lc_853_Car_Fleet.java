package com.company;
import java.util.*;

public class lc_853_Car_Fleet {
    public static int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[] dist = new int[n];
        double[] timeAr = new double[n];
        HashMap<Integer, Double> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            dist[i] = target - position[i]; //calculate distance left for each car
            timeAr[i] = (double) dist[i] / (double) speed[i]; //calculate original time needed for each car
            map.put(dist[i], timeAr[i]); //map distance left with original time needed
        }

        Arrays.sort(dist); //the cars with larger distance left & smaller time needed will chase up the car before
        List<Double> rTimeL = new ArrayList<Double>(); //store time used for each fleet in ascending order
        for (int i = 0; i < n; i++) {
            Double time = map.get(dist[i]);
            int m = rTimeL.size();
            if (m == 0 || time > rTimeL.get(m - 1)) {
                rTimeL.add(time); //new fleet is created
            }
        }
        return rTimeL.size();
    }

    public static void main(String[] args){
        int[] nums1 = new int[]{10,8,0,5,3};
        int[] nums2 = new int[]{2,4,1,1,3};
        String text = "abbccaa";
        int val = 12;
        int ladders = 1;
        int result = carFleet(val, nums1, nums2);
        //System.out.println(Arrays.toString(result));
        System.out.println(result);
    }
}
