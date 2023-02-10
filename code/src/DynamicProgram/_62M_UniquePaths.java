package DynamicProgram;

public class _62M_UniquePaths {

    public int uniquePaths(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }

        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }

        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m - 1][n - 1];
    }

//    dfs/ backtracking
//    int result;
//    int m;
//    int n;
//
//    public int uniquePaths(int m, int n) {
//        this.m = m;
//        this.n = n;
//        result = 0;
//        dfs(0, 0);
//        return result;
//    }
//
//    public void dfs(int i, int j) {
//
//        if (i < m && j < n) {
//            if (i == m - 1 && j == n - 1) {
//                result = result + 1;
//                return;
//            }
//            dfs(i + 1, j);
//            dfs(i, j + 1);
//        }
//    }


}
