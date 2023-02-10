package Intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class _56M_MergeIntervals {
    public int[][] merge(int[][] intervals) {

        List<int[]> result = new ArrayList<>();

        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));

        Iterator<int[]> iterator = Arrays.stream(intervals).iterator();

        int[] oldElement = iterator.next();



        while (iterator.hasNext()) {

            int[] newElement = iterator.next();

            if (oldElement[1] >= newElement[0]) {
                oldElement[0] = Math.min(oldElement[0], newElement[0]);
                oldElement[1] = Math.max(oldElement[1], newElement[1]);
            } else {
                result.add(Arrays.copyOf(oldElement, 2));
                oldElement[0] = newElement[0];
                oldElement[1] = newElement[1];
            }
        }

        result.add(oldElement);

        return result.toArray(new int[result.size()][]);
    }
}
