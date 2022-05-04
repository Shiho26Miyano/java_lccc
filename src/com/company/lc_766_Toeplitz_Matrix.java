package com.company;

import java.util.Arrays;

public class lc_766_Toeplitz_Matrix {
    public static boolean isToeplitzMatrix(int[][] matrix) {
        for (int r = 0; r < matrix.length; ++r)
            for (int c = 0; c < matrix[0].length; ++c)
                if (r > 0 && c > 0 && matrix[r-1][c-1] != matrix[r][c])
                    return false;
        return true;
    }
    public static void main(String[] args){
        int[][] intArray = new int[][]{{1,2,3,4},{5,1,2,3},{9,5,1,2}};
        int target = 5;
        boolean result = isToeplitzMatrix(intArray);
        System.out.println(result);
    }
}
