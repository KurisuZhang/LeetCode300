package Graphs;

import java.util.Arrays;

public class _695M_MaxAreaofIsland {

    boolean[][] visited;
    int[][] grid;
    int sum;

    public int maxAreaOfIsland(int[][] grid) {

        this.visited = new boolean[grid.length][grid[0].length];
        this.grid = grid;
        int max = Integer.MIN_VALUE;
        sum = 0;

        Arrays.stream(visited).forEach((a) -> Arrays.fill(a, false));

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                sum = 0;
                dfs(i, j);
                max = Math.max(max, sum);
            }
        }

        return max;
    }

    public void dfs(int i, int j) {
        if (i < 0 || i >= grid.length ||
                j < 0  || j >= grid[0].length ||
                visited[i][j] || grid[i][j] == 0) {

            return;
        }

        visited[i][j] = true;

        if (grid[i][j] == 1) {
            sum = sum + 1;
            dfs(i + 1, j);
            dfs(i, j + 1);
            dfs(i - 1, j);
            dfs(i, j - 1);
        }
    }
}
