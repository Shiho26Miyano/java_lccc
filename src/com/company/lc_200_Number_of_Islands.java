package com.company;
import java.util.*;
// 1. scan the 2D Matrix, if a node contains '1', it is a root node that tirggers a DFS.
// 2. During the DFS, every visited node should be flipped to '0' after visited
// 3. Count the number of root nodes that trigger DFS.
// This number would be the nubmer of islands since each DFS starting at some root identifies an island

public class lc_200_Number_of_Islands {
    void dfs(char[][] M, int r, int c) {

        if (r < 0 || c < 0 || r >= M.length || c >= M[0].length || M[r][c] == '0') {
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
