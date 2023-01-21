package Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public class _155M_MinStack {

    Deque<int[]> deque;
    int minValue;

    public _155M_MinStack() {

        deque = new ArrayDeque<>();


    }

    public void push(int val) {

        if (deque.isEmpty()){
            minValue = Integer.MAX_VALUE;
        }else {
            minValue = deque.getLast()[1];
        }
        deque.addLast(new int[]{val,Math.min(minValue,val)});
    }

    public void pop() {
        deque.removeLast();
    }

    public int top() {
        return deque.getLast()[0];
    }

    public int getMin() {
        return deque.getLast()[1];
    }

}
