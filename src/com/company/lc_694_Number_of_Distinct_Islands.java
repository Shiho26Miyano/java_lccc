package com.company;
import java.util.*;

public class lc_694_Number_of_Distinct_Islands {
    //https://www.youtube.com/watch?v=c1ZxUOHlulo
    // X = start
    // O = out of bounds Or water
    // U = up
    // D = down
    // R = right
    // L = left
    public int numDistinctIslands(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        Set<String> set = new HashSet<>();
        int m = grid.length, n =grid[0].length;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (grid[i][j] != 0){
                    StringBuilder sb = new StringBuilder();
                    dfs(grid, i, j, sb, "X");
                    grid[i][j] = 0;
                    set.add(sb.toString());
                }
            }
        }
        return set.size();

    }

    private void dfs(int[][] grid, int i, int j, StringBuilder sb, String direction){
        if (i < 0 || i == grid.length ||j < 0 || j==grid[i].length || grid[i][j] == 0) return;

        sb.append(direction);
        grid[i][j] = 0;
        dfs(grid, i-1, j, sb, "U");
        dfs(grid, i+1, j, sb, "D");
        dfs(grid, i, j-1, sb, "L");
        dfs(grid, i, j+1 , sb, "R");
        sb.append("O");
    }
}
