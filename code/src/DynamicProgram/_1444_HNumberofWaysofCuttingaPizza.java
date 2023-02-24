package DynamicProgram;

import java.util.Arrays;
import java.util.stream.Stream;

public class _1444_HNumberofWaysofCuttingaPizza {

    public int ways(String[] pizza, int k) {

        int MOD = 1000000007;
        int m = pizza.length;
        int n = pizza[0].length();
        int[][] count = new int[m+1][n+1];
        int[][][] dp = new int[k][m][n];
        // 前缀和
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {

                if (pizza[i].charAt(j) == 'A') {
                    count[i][j] = 1 + count[i + 1][j] + count[i][j + 1] - count[i + 1][j + 1];
                } else {
                    count[i][j] = count[i + 1][j] + count[i][j + 1] - count[i + 1][j + 1];
                }
            }
        }
        // 初始化 dp[m][n][0]
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (count[i][j]>0){
                    dp[0][i][j] = 1;
                }
            }
        }

        // 状态转移
        for (int remain = 1;  remain<k ; remain++) {
            for (int row = 0; row < m; row++) {
                for (int col = 0; col < n; col++) {
                    // 横切
                    for (int nextRow = row+1; nextRow < m; nextRow++) {
                        if (count[row][col] - count[nextRow][col] >= 1) {
                            dp[remain][row][col] += dp[remain-1][nextRow][col];
                            dp[remain][row][col] %= MOD;
                        }
                    }
                    // 竖切
                    for (int nextCol = col+1; nextCol <n ; nextCol++) {
                        if (count[row][col] - count[row][nextCol] >= 1) {
                            dp[remain][row][col] += dp[remain-1][row][nextCol];
                            dp[remain][row][col] %= MOD;
                        }
                    }
                }
            }
        }

        return dp[k-1][0][0];
    }

    public static void main(String[] args) {
        _1444_HNumberofWaysofCuttingaPizza aa = new _1444_HNumberofWaysofCuttingaPizza();
        aa.ways(new String[]{"A..","AAA","..."}, 3);
    }


}
