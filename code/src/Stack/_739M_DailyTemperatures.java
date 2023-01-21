package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class _739M_DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {

        Deque<Integer> deque = new ArrayDeque<>();
        int[] result = new int[temperatures.length];

        for (int currentDayIndex = 0; currentDayIndex < temperatures.length; currentDayIndex++) {

            while (!deque.isEmpty() && temperatures[currentDayIndex] > temperatures[deque.getLast()]) {
                int previousDayIndex = deque.removeLast();
                result[previousDayIndex] = currentDayIndex - previousDayIndex;
            }

            deque.addLast(currentDayIndex);

        }

        return result;
    }
}
