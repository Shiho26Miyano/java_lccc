package com.company;
import java.util.*;

public class lc_62_Unique_Paths {
    public static int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];

        for(int[] row : arr) {
            Arrays.fill(row, 1);
        }
        for(int col = 1; col < m; ++col) {
            for(int row = 1; row < n; ++row) {
                arr[col][row] = arr[col - 1][row] + arr[col][row - 1];
            }
        }
        return arr[m - 1][n - 1];
    }
    public static void main(String[] args){
        int[] intArray = new int[]{3,3,7,7,10,11,11};
        int m = 3;
        int n = 7;
        //int target =5;
        int [][]ar = new int [3][4];
        // Fill each row with 10.
        for (int[] row : ar)
            Arrays.fill(row, 10);
        System.out.println(Arrays.deepToString(ar));
    }
}
