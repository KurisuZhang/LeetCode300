package HeapPQ;

import java.util.PriorityQueue;

public class _1046E_LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a,b)->(b-a));
        for (int i = 0; i < stones.length; i++) {
            priorityQueue.add(stones[i]);
        }
        while (priorityQueue.size() > 1) {
            int x = priorityQueue.remove();
            int y = priorityQueue.remove();
            if (x != y) {
                priorityQueue.add(x - y);
            } else if (priorityQueue.isEmpty()) {
                priorityQueue.add(0);
            }
        }

        return priorityQueue.remove();

    }
}
