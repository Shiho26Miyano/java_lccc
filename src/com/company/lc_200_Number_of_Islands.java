package com.company;
import java.util.*;
// 1. scan the 2D Matrix, if a node contains '1', it is a root node that tirggers a DFS.
// 2. During the DFS, every visited node should be flipped to '0' after visited
// 3. Count the number of root nodes that trigger DFS.
// This number would be the nubmer of islands since each DFS starting at some root identifies an island

public class lc_200_Number_of_Islands {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int count = 0;
        for (int i = 0; i < grid.length; i++){
            for (int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;

    }

    private void dfs (char[][] grid, int i, int j){
        if(i < 0 || i == grid.length || j < 0|| j == grid[0].length || grid[i][j] == '0') return;

        grid[i][j] = '0';
        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);


    }
}
