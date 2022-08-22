package com.company;
import java.util.*;
public class lc_118_Pascals_Triangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        result.add(new ArrayList<>());
        result.get(0).add(1);

        for (int rowNum = 1; rowNum < numRows; rowNum++){

            List<Integer> currRow = new ArrayList<>();
            List<Integer> prevRow = result.get(rowNum - 1);

            currRow.add(1);

            for (int item = 1; item < rowNum; item++ ){
                currRow.add(prevRow.get(item - 1) + prevRow.get(item));
            }

            currRow.add(1);

            result.add(currRow);


        }
        return result;
    }

    public static void main(String[] args){
        int[] nums1 = new int[]{0,1,2,4,5,7};
        //int[] nums2 = new int[]{2,2,3};
        int val = 2;
        int ladders = 1;
        List<List<Integer>> result = generate(5);
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
