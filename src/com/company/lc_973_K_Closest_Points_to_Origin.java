package com.company;
import java.util.*;

public class lc_973_K_Closest_Points_to_Origin {
    public static int[][] kClosest(int[][] points, int k) {
        // Sort the array with a custom lambda comparator function
        Arrays.sort(points, (a, b) -> squaredDistance(a) - squaredDistance(b));

        // Return the first k elements of the sorted array
        return Arrays.copyOf(points, k);
    }

    private static int squaredDistance(int[] point) {
        // Calculate and return the squared Euclidean distance
        return point[0] * point[0] + point[1] * point[1];
    }
    public static void main(String[] args){
        int[][] intArray = new int[][]{{1,3},{-2,2}};
        int target = 1;
        String s = "code";
        int[][] result = kClosest(intArray, target);
        for (int[] r: result){
            System.out.println(Arrays.toString(r));
        }
    }
}
