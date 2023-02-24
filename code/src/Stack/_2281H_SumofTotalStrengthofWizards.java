package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class _2281H_SumofTotalStrengthofWizards {
    public int totalStrength(int[] strength) {

        int mod = 1000000007;
        int n = strength.length;

        // 单调栈取以此点为最小值的"管辖范围"
        Deque<Integer> increaseStack = new ArrayDeque<>();
        int[] left = new int[n];
        int[] right = new int[n];

        increaseStack.addLast(-1);

        for (int i = 0; i < n; i++) {

            while (increaseStack.getLast() != -1 && strength[i] <= strength[increaseStack.getLast()]) {
                int index = increaseStack.removeLast();
                left[index] = increaseStack.getLast();
                right[index] = i;
            }
            increaseStack.addLast(i);
        }

        // 处理栈里面的剩余值,右边界是 n, 左边界是上一个
        while (increaseStack.getLast() != -1) {
            int index = increaseStack.removeLast();
            right[index] = n;
            left[index] = increaseStack.getLast();
        }

        // 前缀和
        // 前缀和
        long[] preSum1 = new long[n + 1];
        for(int i = 0; i < n; ++i) {
            preSum1[i + 1] += preSum1[i] + strength[i];
            preSum1[i + 1] %= mod;
        }
        // 前缀和的前缀和
        long[] preSum2 = new long[n + 2];
        for(int i = 0; i <= n; ++i) {
            preSum2[i + 1] += preSum2[i] + preSum1[i];
            preSum2[i + 1] %= mod;
        }


        // 求出每个 i 在他的 最小值区间 的贡献(乘以子数组和的和)
        long ans = 0;
        for (int i = 0; i < n; i++) {
            int leftBound = left[i] + 1;
            int rightBound = right[i] - 1;

            long sum = (preSum2[rightBound + 2] - preSum2[i + 1]) * (i - leftBound + 1) -
                    (preSum2[i + 1] - preSum2[leftBound]) * (rightBound - i + 1);
            sum %= mod;
            ans += sum * strength[i];
            ans %= mod;
        }

        return (int) ((ans + mod) % mod);

    }

    public static void main(String[] args) {
        _2281H_SumofTotalStrengthofWizards aa = new _2281H_SumofTotalStrengthofWizards();
        System.out.println(aa.totalStrength(new int[]{5,4,6}));

    }
}
