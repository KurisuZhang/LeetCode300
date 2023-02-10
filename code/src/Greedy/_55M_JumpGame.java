package Greedy;

import java.util.Arrays;

public class _55M_JumpGame {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) {
            return true;
        }

        int lastIndex = nums.length - 1;

        for (int i = nums.length - 2; i >= 0; i--) {

            if (i + nums[i] >= lastIndex) {
                lastIndex = i;
            }
        }

        return lastIndex == 0;
    }

}
