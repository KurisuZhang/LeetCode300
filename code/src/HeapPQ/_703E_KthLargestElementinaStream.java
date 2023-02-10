package HeapPQ;

import java.util.PriorityQueue;

public class _703E_KthLargestElementinaStream {

    PriorityQueue<Integer> priorityQueue;
    int k;

    public _703E_KthLargestElementinaStream(int k, int[] nums) {
        this.k = k;
        this.priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            priorityQueue.add(nums[i]);
        }

        for (int i = k; i < nums.length; i++) {
            priorityQueue.remove();
        }

    }

    public int add(int val) {
        priorityQueue.add(val);
        if (priorityQueue.size() > k) {
            priorityQueue.remove();
        }
        return priorityQueue.peek();
    }

}
