package com.company;
import java.util.*;

public class lc_54_Spiral_Matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new LinkedList<>();
        if (matrix == null || matrix.length == 0) return res;
        int rows = matrix.length, cols = matrix[0].length;
        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;

        while (res.size() < rows * cols ){
            for (int a = left; a <= right && res.size() < rows * cols; a++)
                res.add(matrix[top][a]);

            for (int b = top + 1; b <= bottom - 1 && res.size() < rows * cols; b++)
                res.add(matrix[b][right]);

            for (int c = right; c >= left && res.size() < rows * cols; c--)
                res.add(matrix[bottom][c]);

            for (int d = bottom - 1; d >=top + 1 && res.size() < rows * cols; d--)
                res.add(matrix[d][left]);





            left++; right--; top++; bottom--;
        }
        return res;
    }
}
