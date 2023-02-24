package DynamicProgram;

public class _5M_LongestPalindromicSubstring {

    public String longestPalindrome(String s) {

        if (s.length() == 1) {
            return s;
        }

        boolean[][] dp = new boolean[s.length()][s.length()];
        int[] index = new int[]{0,0};
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
        }

        for (int i = 1; i < s.length(); i++) {
            dp[i][i - 1] = true;
        }

        for (int i = 1; i < s.length(); i++) {
            int row = 0;

            for (int j = i; j < s.length(); j++) {
                dp[row][j] = (s.charAt(row) == s.charAt(j)) && dp[row + 1][j - 1];
                if (dp[row][j]) {
                    if (j - row + 1 > max) {
                        max = j - row + 1;
                        index[0] = row;
                        index[1] = j;
                    }
                }
                row++;
            }
        }


        return s.substring(index[0], index[1] + 1);

    }

}
