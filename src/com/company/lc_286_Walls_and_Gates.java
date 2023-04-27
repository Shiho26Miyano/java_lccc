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

    private void dfs(int[][] rooms, int i, int j, int dist) {
        if(i < 0 || i >= rooms.length || j < 0 || j >= rooms[0].length) return;
        if(rooms[i][j] < dist) return; // 0, -1, smaller distance already filled before
        rooms[i][j] = dist; //Only case left: INF
        dfs(rooms, i + 1, j, dist + 1);
        dfs(rooms, i - 1, j, dist + 1);
        dfs(rooms, i, j + 1, dist + 1);
        dfs(rooms, i, j - 1, dist + 1);
    }
}
