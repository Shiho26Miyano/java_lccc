package com.company;
import java.util.*;
public class lc_59_Spiral_Matrix_II {
    public int[][] generateMatrix(int n) {
        int startx = 0;
        int starty = 0;
        int loop = n / 2;
        int mid = n / 2;
        int counter = 1;
        int cut = 1;
        int i, j;
        int[][] res = new int[n][n];

        while(loop-- > 0){
            for (j = starty; j < n - cut; j++)
                res[startx][j] = counter++;
            for (i = startx; i < n - cut; i++)
                res[i][j] = counter++;
            for (j = n - cut; j > starty; j--)
                res[i][j] = counter++;
            for (i = n - cut; i > startx; i--)
                res[i][j] = counter++;

            startx++;
            starty++;
            cut++;
        }
        if (n % 2 != 0 ) {
            res[mid][mid] = counter;
        }
        return res;

    }

}
