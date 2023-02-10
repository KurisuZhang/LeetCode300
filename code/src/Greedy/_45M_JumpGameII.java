package Greedy;

import java.util.Arrays;

public class _45M_JumpGameII {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;


        for (int i = 0; i < nums.length - 1; i++) {

            int num = nums[i]+i;

            if (num > nums.length - 1) {
                num = nums.length - 1;
            }

            for (int j = i+1; j <= num; j++) {
                dp[j] = Math.min(dp[j], dp[i] + 1);
            }

        }
        return dp[nums.length - 1];
    }
}
