package Graphs;

import java.util.Arrays;

public class _200M_NumberofIslands {

    boolean[][] visited;
    char[][] grid;

    public int numIslands(char[][] grid) {

        this.grid = grid;
        visited = new boolean[grid.length][grid[0].length];
        Arrays.stream(visited).forEach((a) -> Arrays.fill(a, false));
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (!visited[i][j] && grid[i][j]=='1') {
                    dfs(i, j);
                    count++;
                }
            }
        }

        return count;
    }


    public void dfs(int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || visited[i][j]) {
            return;
        }

        visited[i][j] = true;
        if (grid[i][j] == '0') {
            return;
        } else {
            dfs(i + 1, j);
            dfs(i, j + 1);
            dfs(i - 1, j);
            dfs(i, j - 1);
        }
    }
}
