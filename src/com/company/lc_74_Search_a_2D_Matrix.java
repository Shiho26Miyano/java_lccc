package com.company;
import java.util.*;
public class lc_74_Search_a_2D_Matrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0)
            return false;
        int n = matrix[0].length;

        // binary search
        int left = 0, right = m * n - 1;
        int pivotIdx, pivotElement;
        while (left <= right) {
            pivotIdx = (left + right) / 2;
            pivotElement = matrix[pivotIdx / n][pivotIdx % n];
            if (target == pivotElement)
                return true;
            else {
                if (target < pivotElement)
                    right = pivotIdx - 1;
                else
                    left = pivotIdx + 1;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[][] vec = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 16;
        boolean result = searchMatrix(vec, target);
        System.out.println(result);
    }
}
