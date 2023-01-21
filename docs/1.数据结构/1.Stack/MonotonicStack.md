## Monotonic stack

解决最近的一个大于或小于他的数的 index 组成的 list

```java
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
```

