package HeapPQ;

import java.util.PriorityQueue;

public class _215M_KthLargestElementin {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            priorityQueue.add(nums[i]);
            if (priorityQueue.size() > k) {
                priorityQueue.remove();
            }
        }

        return priorityQueue.remove();
    }
}
