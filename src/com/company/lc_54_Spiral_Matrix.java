package com.company;
import java.util.*;

public class lc_54_Spiral_Matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new LinkedList<>();
        if (matrix == null || matrix.length == 0) return res;
        int row = matrix.length, col = matrix[0].length;
        int up = 0,  down = row - 1;
        int left = 0, right = col - 1;
        while (res.size() < row * col) {
            for (int j = left; j <= right && res.size() < row * col; j++)
                res.add(matrix[up][j]);

            for (int i = up + 1; i <= down - 1 && res.size() < row * col; i++)
                res.add(matrix[i][right]);

            for (int j = right; j >= left && res.size() < row * col; j--)
                res.add(matrix[down][j]);

            for (int i = down - 1; i >= up + 1 && res.size() < row * col; i--)
                res.add(matrix[i][left]);

            left++; right--; up++; down--;
        }
        return res;
    }
}
