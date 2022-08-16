package com.company;
import java.util.*;

public class lc_881_Boats_to_Save_People {
    public static int numRescueBoats(int[] people, int limit) {

        Arrays.sort(people);

        int  start  =0;
        int  end = people.length-1;
        int  boat =0;

        while(start <=end){
            if(people[end] + people[start] <= limit){
                start++;
            }
            end--;
            boat++;

        }
        return  boat;
    }
    public static void main(String[] args){
        int[] nums1 = new int[]{1,2};
        //int[] nums2 = new int[]{2,2,3};
        int val = 3;
        int result = numRescueBoats(nums1, val);
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
