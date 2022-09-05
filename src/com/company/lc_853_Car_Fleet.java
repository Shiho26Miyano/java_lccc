package com.company;
import java.util.*;

public class lc_853_Car_Fleet {
    public static int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[] leftDistance = new int[n];
        double[] leftHour = new double[n];
        HashMap<Integer, Double> map = new HashMap<>();

        for (int i = 0; i < n; i++){
            leftDistance[i] = target - position[i];
            leftHour[i] = (double) leftDistance[i] / (double) speed[i];
            map.put(leftDistance[i], leftHour[i]);
        }

        Arrays.sort(leftDistance);
        List<Double> ansHour = new ArrayList<>();

        for (int i = 0; i < n; i++){
            Double currentCarHour = map.get(leftDistance[i]);
            int preCarFleetHour = ansHour.size();


            if (preCarFleetHour == 0 || currentCarHour > ansHour.get(preCarFleetHour - 1))
                ansHour.add(currentCarHour);

        }
        return ansHour.size();
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
