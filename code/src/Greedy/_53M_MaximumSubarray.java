package Greedy;

public class _53M_MaximumSubarray {
    public int maxSubArray(int[] nums) {

        int start = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int end = 0; end < nums.length; end++) {
            sum = sum + nums[end];
            if (sum <= 0) {

                sum = 0;
            }

            max = Math.max(max, sum);

        }

        return max;
    }

}
