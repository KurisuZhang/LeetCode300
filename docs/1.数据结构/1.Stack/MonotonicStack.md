## Monotonic stack

求往后最近一个小于它的值, max Monotonic stack

求往后最近一个大于它的值, min Monotonic stack

```java
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
```





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

