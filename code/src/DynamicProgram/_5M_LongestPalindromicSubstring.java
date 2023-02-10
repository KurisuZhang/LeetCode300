package DynamicProgram;

public class _5M_LongestPalindromicSubstring {

    public String longestPalindrome(String s) {

        if (s.length() == 1) {
            return s;
        }

        boolean[][] dp = new boolean[s.length()][s.length()];
        int[] index = new int[]{0,1};

        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
        }

        for (int i = 1; i < s.length(); i++) {
            dp[i][i - 1] = true;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            int row = 0;

            for (int column = i + 1; column < s.length(); column++) {

                if (s.charAt(row) == s.charAt(column) && dp[row + 1][column - 1]) {
                    dp[row][column] = true;
                    if (index[1] < column - row + 1) {
                        index[1] = column - row + 1;
                        index[0] = row;
                    }
                }
                row++;
            }
        }

        return s.substring(index[0], index[0] + index[1]);
    }

}
