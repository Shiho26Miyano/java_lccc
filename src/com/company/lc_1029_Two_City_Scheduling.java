package com.company;
import java.util.*;


public class lc_1029_Two_City_Scheduling {
    public static int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (a, b) -> (a[0] - a[1] - (b[0] - b[1])));
        int cost = 0;
        for (int i = 0; i < costs.length; i++) {
            if (i < costs.length / 2) {
                cost += costs[i][0];
            } else {
                cost += costs[i][1];
            }
        }
        return cost;
    }

    public static void main(String[] args){
        int[][] matrix = new int[][]{{10,20}, {30,200}, {400, 50}, {30, 20}};
        //int[] nums2 = new int[]{2,2,3};
        int val = 2;
        int ladders = 1;
        String stringA = "3[a]2[bc]";
        int result = twoCitySchedCost(matrix);
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
