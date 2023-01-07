package com.company;
import java.util.*;

public class lc_200_Number_of_Islands {
    void dfs(char[][] M, int r, int c) {
        int nr = M.length;
        int nc = M[0].length;

        if (r < 0 || c < 0 || r >= nr || c >= nc || M[r][c] == '0') {
            return;
        }

        M[r][c] = '0';
        dfs(M, r - 1, c);
        dfs(M, r + 1, c);
        dfs(M, r, c - 1);
        dfs(M, r, c + 1);
    }
    public int numIslands(char[][] M) {
        if(M == null || M.length == 0){
            return 0;
        }
        int count = 0;
        for (int r = 0; r < M.length; r++){
            for (int c = 0 ; c < M[0].length; c++){
                if(M[r][c] == '1'){
                    dfs(M,r,c);
                    count++;
                }
            }
        }

        return count;
    }
}
