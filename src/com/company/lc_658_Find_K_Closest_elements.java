package com.company;
import java.util.*;

public class lc_658_Find_K_Closest_elements {
    public  static List<Integer> findClosestElements(int[] arr, int k, int x) {
        // Initialize binary search bounds
        int left = 0;
        int right = arr.length - k;

        // Binary search against the criteria described
        while (left < right) {
            int mid = (left + right) / 2;
            if (x - arr[mid] > arr[mid + k] - x) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        // Create output in correct format
        List<Integer> result = new ArrayList<Integer>();
        for (int i = left; i < left + k; i++) {
            result.add(arr[i]);
        }

        return result;
    }


    public static void main(String[] args){
        int[] intArray = new int[]{1, 2, 3, 4, 5};
        int k = 4;
        int x = 3;
        List<Integer> result =  findClosestElements(intArray, k, x);
        System.out.println((result));
    }
}
