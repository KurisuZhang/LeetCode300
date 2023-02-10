package HeapPQ;


import java.util.Arrays;
import java.util.Map;
import java.util.PriorityQueue;

public class _973E_KClosestPointstoOrigin {
    public static int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(
                (a,b)-> (int) ((Math.pow(a[0],2)+Math.pow(a[1],2)) -(Math.pow(b[0],2)+Math.pow(b[1],2))));

        for (int[] point : points) {
            priorityQueue.add(point);
        }

        int[][] result = new int[k][];
        for (int i = 0; i < k; i++) {
            result[i] = priorityQueue.remove();
        }

        return result;

    }

    public static void main(String[] args) {

    }
}
