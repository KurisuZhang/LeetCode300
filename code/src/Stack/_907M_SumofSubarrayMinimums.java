package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class _907M_SumofSubarrayMinimums {
    public int sumSubarrayMins(int[] arr) {

        Deque<Integer> deque = new ArrayDeque<>();
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        long ans = 0;
        int mod = (int) (1E9 + 7);

        deque.addLast(-1);

        for (int i = 0; i < arr.length; i++) {

            while (deque.getLast() != -1 && arr[i] <= arr[deque.getLast()]) {
                int index = deque.removeLast();
                left[index] = deque.getLast();
                right[index] = i;
            }
            deque.addLast(i);
        }

        while (deque.getLast() != -1) {
            int index = deque.removeLast();
            right[index] = arr.length;
            left[index] = deque.getLast();
        }

        for (int i = 0; i < arr.length; i++) {

            long leftNumber = (i - (left[i] + 1)) + 1;
            long rightNumber = (right[i] - 1 - i) + 1;
            long total = leftNumber * rightNumber;
            ans = (ans + leftNumber * rightNumber * arr[i]) % mod;
        }

        return (int) ans;
    }

    public static void main(String[] args) {
        _907M_SumofSubarrayMinimums aa = new _907M_SumofSubarrayMinimums();
        System.out.println(aa.sumSubarrayMins(new int[]{11, 81, 94, 43, 3}));


    }
}
