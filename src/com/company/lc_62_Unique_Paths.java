package com.company;
import java.util.*;

public class lc_62_Unique_Paths {
    public static int uniquePaths(int m, int n) {
        int[][] d = new int[m][n];

        for(int[] arr : d) {
            Arrays.fill(arr, 1);
        }
        for(int col = 1; col < m; ++col) {
            for(int row = 1; row < n; ++row) {
                d[col][row] = d[col - 1][row] + d[col][row - 1];
            }
        }
        return d[m - 1][n - 1];
    }
    public static void main(String[] args){
        int[] intArray = new int[]{3,3,7,7,10,11,11};
        int m = 3;
        int n = 7;
        //int target =5;
        int result = uniquePaths(m, n);
        System.out.println(result);
    }
}
