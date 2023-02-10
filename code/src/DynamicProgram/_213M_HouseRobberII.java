package DynamicProgram;

import java.util.Arrays;

public class _213M_HouseRobberII {

    int[] nums;
    int[] dp;

    public int rob(int[] nums) {
        this.nums = nums;
        this.dp = new int[nums.length];

        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        dp[0] = nums[0];
        dp[1] = Math.max(dp[0], nums[1]);
        int num1 = DP(2, nums.length - 1);

        Arrays.fill(dp, 0);
        dp[1] = nums[1];
        dp[2] = Math.max(dp[1], nums[2]);
        int num2 = DP(3, nums.length);

        return Math.max(num1, num2);

    }

    public int DP(int start, int end) {

        for (int i = start; i < end; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }

        return dp[end - 1];
    }
}
