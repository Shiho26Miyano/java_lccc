package com.company;

public class lc_79_Word_Search {
    boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];
        /* ensure all the nodes will be searched as the beginning point */
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(i, j, 0, board, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(int row, int col, int index, char[][] board, String word) {
        /*  1. out of bound
            2. already visited
            3. not match    */
        if (checkBound(row, col, board) == -1 ||
                visited[row][col] ||
                word.charAt(index) != board[row][col]) {
            return false;
        }

        /* find one matched character, mark the current node as visited */
        visited[row][col] = true;

        /* find the whole word! */
        if (index == word.length() - 1) {
            return true;
        }

        /* continue searching the next char by extending the index of string,
        note that the current char may not belong to the word in the final.
        even though it matches until now */
        index++;

        /* down, right, up, left search */
        if (dfs(row + 1, col, index, board, word) ||
                dfs(row, col + 1, index, board, word) ||
                dfs(row - 1, col, index, board, word) ||
                dfs(row, col - 1, index, board, word)) {
            return true;
        }

        /* current position is wrong, backtracking */
        visited[row][col] = false;
        return false;
    }

    public int checkBound(int row, int col, char[][] board) {
        if (row == -1 || row == board.length || col == -1 || col == board[0].length) {
            return -1;
        }
        return 0;
    }
}
