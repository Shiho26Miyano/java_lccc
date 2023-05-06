package com.company;
import java.util.*;

public class lc_286_Walls_and_Gates {
    public void wallsAndGates(int[][] rooms) {
        for(int i = 0; i < rooms.length; i++) {
            for(int j = 0; j < rooms[0].length; j++) {
                if(rooms[i][j] == 0) {
                    dfs(rooms, i, j, 0);
                }
            }
        }
    }
    // we want to exclude 1.i is out of range 2. j is out of range 3. roomms[i][j] already hit the min distance until now
    private void dfs(int[][] rooms, int i, int j, int dist) {
        if(i < 0 || i >= rooms.length || j < 0 || j >= rooms[0].length || rooms[i][j] <= dist && dist != 0) return;
        rooms[i][j] = dist; //Only case left: INF
        dfs(rooms, i + 1, j, dist + 1);
        dfs(rooms, i - 1, j, dist + 1);
        dfs(rooms, i, j + 1, dist + 1);
        dfs(rooms, i, j - 1, dist + 1);
    }
}

