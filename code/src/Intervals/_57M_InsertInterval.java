package Intervals;

import java.util.ArrayList;
import java.util.Collections;

public class _57M_InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        ArrayList<int[]> arrayList = new ArrayList<>();

        int start = newInterval[0];
        int end = newInterval[1];

        for (int[] interval : intervals){

            if ((interval[0] <= start && interval[1] >= start) ||
                    (start <= interval[0] && end >= interval[0])) {
                if (!(start<=interval[0]&&end>=interval[1])){
                    start = Math.min(interval[0], start);
                    end = Math.max(interval[1], end);

                }


            } else {
                arrayList.add(interval);
            }

        }
        arrayList.add(new int[]{start, end});
        arrayList.sort((a, b) -> (a[0] - b[0]));
        return arrayList.toArray(new int[arrayList.size()][]);
    }
}
