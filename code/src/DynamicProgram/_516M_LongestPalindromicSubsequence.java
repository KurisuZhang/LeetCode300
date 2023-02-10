package DynamicProgram;

import java.util.Arrays;

public class _516M_LongestPalindromicSubsequence {

    public int longestPalindromeSubseq(String s) {

        if (s.length() == 1) {
            return s.length();
        }

        int[][] dp = new int[s.length()][s.length()];
        int max = 1;

        Arrays.stream(dp).forEach(a -> Arrays.fill(a, 0));

        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = 1;
        }


        for (int i = 0; i < s.length() - 1; i++) {
            int row = 0;

            for (int column = i + 1; column < s.length(); column++) {

                if (s.charAt(row) == s.charAt(column)) {
                    dp[row][column] = dp[row + 1][column - 1] + 2;
                    max = Math.max(max, dp[row][column]);
                }else {
                    dp[row][column] = Math.max(dp[row][column - 1], dp[row + 1][column]);
                }

                row++;
            }
        }

        return max;
    }

}
