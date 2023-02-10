## Top "kth"

```java
// 构建 heap
// 修改 comparator 实现特定排序
PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

// 添加进 heap k 个元素, 只保留 Kth 长度
for (int i = 0; i < k; i++) {
    priorityQueue.add(nums[i]);
}

// 循环更新
for (int i = k; i < nums.length; i++) {
    if (nums[i] > priorityQueue.peek()){
        priorityQueue.remove();
        priorityQueue.add(nums[i]);
    }
}

return priorityQueue.remove();
```





## Top "kth" frequent

```java
// 构建一个hashMap统计频次
// 构建一个 heap 存储排序
HashMap<Integer, Integer> hashMap = new HashMap<>();
PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new PriorityQueue<>((a,b)->  b.getValue() - a.getValue());
// 存储结果
ArrayList<Integer> arrayList = new ArrayList<>();
// 加入 hashmap
for (int num : nums) {
    hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
}
// 加入 heap
priorityQueue.addAll(hashMap.entrySet());

for (int i = 0; i < k; i++) {
    arrayList.add(priorityQueue.remove().getKey());
}

return arrayList.stream().mapToInt(Integer::intValue).toArray();
```



## Merge k list

构建  heap 存 k 个元素

每次移除 heap 的一个元素

再添加一个元素(被移除元素的 list,剩下的元素)

```java
PriorityQueue<ListNode> minHeap = new PriorityQueue<ListNode>((n1, n2) -> n1.value - n2.value);

// put the root of each list in the min heap
for (ListNode root : lists)
  if (root != null)
    minHeap.add(root);

// take the smallest (top) element form the min-heap and add it to the result; 
// if the top element has a next element add it to the heap
ListNode resultHead = null, resultTail = null;
while (!minHeap.isEmpty()) {
  ListNode node = minHeap.poll();
  if (resultHead == null) {
    resultHead = resultTail = node;
  } else {
    resultTail.next = node;
    resultTail = resultTail.next;
  }
  if (node.next != null)
    minHeap.add(node.next);
}
```



## 双 heap (Median)

```java
    public  void MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    }

    public void addNum(int num) {
        
        // 1. 添加到 heap
        if (maxHeap.isEmpty() || num >= maxHeap.peek()){
            minHeap.add(num);
        }else{ // num < maxHeap.peek()
            maxHeap.add(num);
        }
        
        // 2. 维护两个heap的长度, 差值不超过 1, 且只能 maxheap>= minheap
        if (maxHeap.size() > minHeap.size() +1){
            minHeap.add(maxHeap.remove());
        }else if (maxHeap.size() < minHeap.size()){
            maxHeap.add(minHeap.remove());
        }
    }

    public double findMedian() {
        
        // 3. 计算median
        if (maxHeap.size() == minHeap.size()){
            return (maxHeap.peek()/ 2.0 + minHeap.peek()/ 2.0) ;
        }
        return maxHeap.peek();
    }
```

