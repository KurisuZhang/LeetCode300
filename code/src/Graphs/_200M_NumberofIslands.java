package Graphs;

import java.util.Arrays;

public class _200M_NumberofIslands {

    char[][] grid;
    boolean[][] visited;

    public int numIslands(char[][] grid) {

        this.grid = grid;
        this.visited = new boolean[grid.length][grid[0].length];
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                if (!visited[i][j]&&grid[i][j]=='1') {
                    dfs(i, j);
                    count++;
                }
            }
        }

        return count;
    }

    public void dfs(int i, int j) {

        if (i < 0 || j < 0 || i > grid.length - 1 || j > grid[0].length - 1) {
            return;
        }

        if (visited[i][j]) {
            return;
        }

        visited[i][j] = true;

        if (grid[i][j] == '1') {
            dfs(i - 1, j);
            dfs(i + 1, j);
            dfs(i, j - 1);
            dfs(i, j + 1);
        }
    }
}
