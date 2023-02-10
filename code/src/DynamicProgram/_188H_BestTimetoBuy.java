package DynamicProgram;

import java.util.Arrays;

public class _188H_BestTimetoBuy {
    public int maxProfit(int k, int[] prices) {

        if (prices.length == 0) {
            return 0;
        }

        int n = prices.length;
        k = Math.min(k, n / 2);

        // 初始化
        int[][] sell = new int[n][k + 1];
        int[][] buy = new int[n][k + 1];

        buy[0][0] = -prices[0];
        sell[0][0] = 0;

        for (int j = 1; j < k + 1;j++ ) {
            buy[0][j] = Integer.MIN_VALUE/2;
            sell[0][j] = Integer.MIN_VALUE/2;
        }

        //状态转移方程
        for (int i = 1; i < n; i++) {
            buy[i][0] = Math.max(buy[i - 1][0], sell[i - 1][0]-prices[i]);
            for (int j = 1; j < k+1; j++) {
                buy[i][j] = Math.max(buy[i - 1][j], sell[i - 1][j]-prices[i]);
                sell[i][j] = Math.max(sell[i - 1][j], buy[i - 1][j - 1] + prices[i]);
            }
        }


        return Arrays.stream(sell[n - 1]).max().getAsInt();

    }
}












