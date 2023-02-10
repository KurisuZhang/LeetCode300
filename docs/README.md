# LeetCode

[toc]

## Tree

1.反转

2.排序

| Method                                            | Name                                                         | Difficulty |  TC  |
| ------------------------------------------------- | :----------------------------------------------------------- | :--------: | :--: |
| 翻转tree,postOrder                                | [226. Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/) |    E 🟢     |  n   |
| inOrder                                           | [94. Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/) |    E 🟢     |  n   |
| 求Depth, DFS                                      | [104. Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/) |    E 🟢     |  n   |
| 求最长路径, DFS,数学 [思路](./5.题解思路/tree.md) | [543. Diameter of Binary Tree](https://leetcode.com/problems/diameter-of-binary-tree/) |    E 🟢     |  n   |
| height-balanced, dfs-postorder                    | [110. Balanced Binary Tree](https://leetcode.com/problems/balanced-binary-tree/) |    E 🟢     |  n   |
| dfs-preOrder                                      | [100. Same Tree](https://leetcode.com/problems/same-tree/)   |    E 🟢     |  n   |
| Dfs                                               | [235. Lowest Common Ancestor of a Binary Search Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/) |    M 🟡     |  n   |
|                                                   |                                                              |            |      |
| E 🟢                                               | M 🟡                                                          |    H 🔴     |      |



## Arrays&Hashing

1. 重复元素
1. 判断相等
1. 找出两个数符合某种 pattern
1. 找出所有的 anagram

| Method                                                       | Name                                                         | Difficulty |  TC  |
| ------------------------------------------------------------ | :----------------------------------------------------------- | :--------: | :--: |
| 重复元素, hashset                                            | [217. Contains Duplicate](https://leetcode.com/problems/contains-duplicate/) |    E 🟢     |  n   |
| 判断相等,hashMap记录出现次数                                 | [242. Valid Anagram](https://leetcode.com/problems/valid-anagram/) |    E 🟢     |  n   |
| 找出两个数符合某种 pattern<br />hashmap 附上序号区分不同的元素 | [1. Two Sum](https://leetcode.com/problems/two-sum/)         |    E 🟢     |  n   |
| 找出所有的 anagram,排序最为hash                              | [49. Group Anagrams](https://leetcode.com/problems/group-anagrams/) |    M 🟡     |  nk  |
|                                                              |                                                              |            |      |
| E 🟢                                                          | M 🟡                                                          |    H 🔴     |      |



## Two Pointers

| Method                                                       | Name                                                         | Difficulty |  TC   |
| ------------------------------------------------------------ | :----------------------------------------------------------- | :--------: | :---: |
| reverse                                                      | [125. Valid Palindrome](https://leetcode.com/problems/valid-palindrome/) |    E 🟢     |   n   |
| Pair Sum in a Sorted                                         | [167. Two Sum II - Input Array Is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/) |    M 🟡     |   n   |
| Pair Sum in a Sorted [去重操作](https://github.com/KurisuZhang/LeetCode300/blob/main/code/src/TwoPoint/_15M_3Sum.java) | [15. 3Sum](https://leetcode.com/problems/3sum/)              |    M 🟡     | $n^2$ |
| E 🟢                                                          | M 🟡                                                          |    H 🔴     |       |



## Sliding Window

| Method                                                    | Name                                                         | Difficulty |  TC  |
| --------------------------------------------------------- | :----------------------------------------------------------- | :--------: | :--: |
| 只关注头尾的滑动窗口                                      | [121. Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) |    E 🟢     |  n   |
| 不重复的最长子串,哈希                                     | [3. Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) |    M 🟡     |  n   |
| K 个容错的最长子串,数学关系:<br />$end-start+1-maxFreq=k$ | [424. Longest Repeating Character Replacement](https://leetcode.com/problems/longest-repeating-character-replacement/) |    M 🟡     |  n   |
|                                                           |                                                              |            |      |
|                                                           |                                                              |            |      |
| E 🟢                                                       | M 🟡                                                          |    H 🔴     |      |

## Stack

| Method                                         | Name                                                         | Difficulty |  TC  |
| ---------------------------------------------- | :----------------------------------------------------------- | :--------: | :--: |
| Stack,套 map                                   | [20. Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) |    E 🟢     |  n   |
| Two stack, 嵌套 stack,增加空间,减少时间        | [155. Min Stack](https://leetcode.com/problems/min-stack/)   |    M 🟡     |  1   |
| Monitonic Stack, [思路](./5.题解思路/Stack.md) | [739. Daily Temperatures](https://leetcode.com/problems/daily-temperatures/) |    M 🟡     |      |
|                                                |                                                              |            |      |
| E 🟢                                            | M 🟡                                                          |    H 🔴     |      |



## Binary Search

| Method           | Name                                                         | Difficulty |  TC  |
| ---------------- | :----------------------------------------------------------- | :--------: | :--: |
| 基础款           | [704. Binary Search](https://leetcode.com/problems/binary-search/) |    E 🟢     | logn |
| 2d, 数学解决排序 | [74. Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/) |    M 🟡     |      |
| 部分排序         | [33. Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/) |    M 🟡     | logn |
|                  |                                                              |            |      |
| E 🟢              | M 🟡                                                          |    H 🔴     |      |



## Linked List

| Method                                                       | Name                                                         | Difficulty |  TC  |
| ------------------------------------------------------------ | :----------------------------------------------------------- | :--------: | :--: |
| inPlace,[思路](./5.题解思路/LinkedList.md)                   | [206. Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/) |    E 🟢     |  n   |
| ListNode head = new ListNode();<br />ListNode current = head; | [21. Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/) |    E 🟢     |  n   |
| fastSlow 拆分成两部分, 第二部分 reverse,拼接第一部分和第二部分 | [143. Reorder List](https://leetcode.com/problems/reorder-list/) |    M 🟡     |  n   |
| 先 slow fast 找点位置, 再 delete                             | [19. Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/) |    M 🟡     |  n   |
|                                                              |                                                              |            |      |
| E 🟢                                                          | M 🟡                                                          |    H 🔴     |      |



## Trie

| Method | Name                                                         | Difficulty |     TC      |
| ------ | :----------------------------------------------------------- | :--------: | :---------: |
|        | [208. Implement Trie (Prefix Tree)](https://leetcode.com/problems/implement-trie-prefix-tree/) |    M 🟡     | Word.length |
|        | [211. Design Add and Search Words Data Structure](https://leetcode.com/problems/design-add-and-search-words-data-structure/) |    M 🟡     | Word.length |
|        |                                                              |            |             |
| E 🟢    | M 🟡                                                          |    H 🔴     |             |



## Heap&PQ

| Method                                                 | Name                                                         | Difficulty |  TC  |
| ------------------------------------------------------ | :----------------------------------------------------------- | :--------: | :--: |
| 可以用 minHeap 求 Kth Large<br />remove n-k个 min 的值 | [703. Kth Largest Element in a Stream](https://leetcode.com/problems/kth-largest-element-in-a-stream/) |    E 🟢     |      |
| 逻辑                                                   | [1046. Last Stone Weight](https://leetcode.com/problems/last-stone-weight/) |    E 🟢     |      |
|                                                        | [973. K Closest Points to Origin](https://leetcode.com/problems/k-closest-points-to-origin/) |    M 🟡     |      |
|                                                        | [215. Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/) |    M 🟡     |      |
|                                                        |                                                              |            |      |
| E 🟢                                                    | M 🟡                                                          |    H 🔴     |      |



## Backtracking

| Method                 | Name                                                         | Difficulty |   TC    |
| ---------------------- | :----------------------------------------------------------- | :--------: | :-----: |
|                        | [78. Subsets](https://leetcode.com/problems/subsets/)        |    M 🟡     |  $2^n$  |
|                        | [46. Permutations](https://leetcode.com/problems/permutations/) |    M 🟡     |  $n!$   |
|                        | [39. Combination Sum](https://leetcode.com/problems/combination-sum/) |    M 🟡     | $C_N^k$ |
| 重复元素,sort 确定唯一 | [90. Subsets II](https://leetcode.com/problems/subsets-ii/)  |    M 🟡     |  $2^n$  |
|                        |                                                              |            |         |
| E 🟢                    | M 🟡                                                          |    H 🔴     |         |



## Graph

| Method                        | Name                                                         | Difficulty |  TC  |
| ----------------------------- | :----------------------------------------------------------- | :--------: | :--: |
| Dfs                           | [200. Number of Islands](https://leetcode.com/problems/number-of-islands/) |    M 🟡     | v+e  |
| Dfs, 复制 customized 数据结构 | [133. Clone Graph](https://leetcode.com/problems/clone-graph/) |    M 🟡     | v+e  |
|                               | [695. Max Area of Island](https://leetcode.com/problems/max-area-of-island/) |    M 🟡     | v+e  |
|                               |                                                              |            |      |
| E 🟢                           | M 🟡                                                          |    H 🔴     |      |





## Dynamic Programming

| Method                                                      | Name                                                         | Difficulty |  TC   |
| ----------------------------------------------------------- | :----------------------------------------------------------- | :--------: | :---: |
| Buy,sell                                                    | [188. Best Time to Buy and Sell Stock IV](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/) |    H 🔴     | $n^2$ |
| dp[i] = dp[i - 1] + dp[i - 2]                               | [70. Climbing Stairs](https://leetcode.com/problems/climbing-stairs/) |    E 🟢     |   n   |
| dp[i] = Math.min(dp[i - 1] + cost[i], dp[i - 2] + cost[i]); | [746. Min Cost Climbing Stairs](https://leetcode.com/problems/min-cost-climbing-stairs/) |    E 🟢     |   n   |
| dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);           | [198. House Robber](https://leetcode.com/problems/house-robber/) |    M 🟡     |   n   |
| 走两次                                                      | [213. House Robber II](https://leetcode.com/problems/house-robber-ii/) |    M 🟡     |   n   |
|                                                             | [5. Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/) |    M 🟡     | $n^2$ |
|                                                             | [516. Longest Palindromic Subsequence](https://leetcode.com/problems/longest-palindromic-subsequence/) |    M 🟡     | $n^2$ |
| $dp[i] = Math.max(dp[i], dp[j] + 1)$                        | [300. Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence/) |    M 🟡     | $n^2$ |
|                                                             |                                                              |            |       |
| $dp[i][j] = dp[i - 1][j] + dp[i][j - 1];$                   | [62. Unique Paths](https://leetcode.com/problems/unique-paths/) |    M 🟡     |  m*n  |
|                                                             | [1143. Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/) |    M 🟡     |       |
|                                                             |                                                              |            |       |
| E 🟢                                                         | M 🟡                                                          |    H 🔴     |       |





## Greedy

| Method | Name                                                         | Difficulty |  TC  |
| ------ | :----------------------------------------------------------- | :--------: | :--: |
|        | [53. Maximum Subarray](https://leetcode.com/problems/maximum-subarray/) |    M 🟡     |  n   |
|        | [55. Jump Game](https://leetcode.com/problems/jump-game/)    |    M 🟡     |  n   |
|        | [45. Jump Game II](https://leetcode.com/problems/jump-game-ii/) |    M 🟡     |  n   |
|        |                                                              |            |      |
| E 🟢    | M 🟡                                                          |    H 🔴     |      |



## Merge Interval

| Method | Name                                                         | Difficulty |  TC  |
| ------ | :----------------------------------------------------------- | :--------: | :--: |
|        | [57. Insert Interval](https://leetcode.com/problems/insert-interval/) |    M 🟡     |  n   |
|        | [56. Merge Intervals](https://leetcode.com/problems/merge-intervals/) |    M 🟡     |  n   |
|        |                                                              |            |      |
|        |                                                              |            |      |
| E 🟢    | M 🟡                                                          |    H 🔴     |      |



## Math&Geo

| Method | Name                                                         | Difficulty |  TC   |
| ------ | :----------------------------------------------------------- | :--------: | :---: |
|        | [48. Rotate Image](https://leetcode.com/problems/rotate-image/) |    M 🟡     | $n^2$ |
|        | [54. Spiral Matrix](https://leetcode.com/problems/spiral-matrix/) |    M 🟡     | $n^2$ |
|        |                                                              |            |       |
| E 🟢    | M 🟡                                                          |    H 🔴     |       |



## Bitwise

| Method       | Name                                                         | Difficulty |   TC   |
| ------------ | :----------------------------------------------------------- | :--------: | :----: |
|              | [136. Single Number](https://leetcode.com/problems/single-number/) |    E 🟢     |   n    |
|              | [7. Reverse Integer](https://leetcode.com/problems/reverse-integer/) |    M 🟡     | Log(x) |
| n &= (n - 1) | [191. Number of 1 Bits](https://leetcode.com/problems/number-of-1-bits/) |            |        |
|              |                                                              |            |        |
| E 🟢          | M 🟡                                                          |    H 🔴     |        |



## Topological Sort

| Method | Name                                                         | Difficulty |  TC  |
| ------ | :----------------------------------------------------------- | :--------: | :--: |
|        | [207. Course Schedule](https://leetcode.com/problems/course-schedule/) |    M 🟡     | V+E  |
|        | [269. Alien Dictionary](https://leetcode.com/problems/alien-dictionary/) |    H 🔴     | V+E  |
|        |                                                              |            |      |
| E 🟢    | M 🟡                                                          |    H 🔴     |      |



## Union Find

| Method | Name                                                         | Difficulty |  TC  |
| ------ | :----------------------------------------------------------- | :--------: | :--: |
|        | [684. Redundant Connection](https://leetcode.com/problems/redundant-connection/) |    M 🟡     |  n   |
|        |                                                              |            |      |
| E 🟢    | M 🟡                                                          |    H 🔴     |      |





| Method | Name | Difficulty |  TC  |
| ------ | :--- | :--------: | :--: |
|        |      |            |      |
|        |      |            |      |
| E 🟢    | M 🟡  |    H 🔴     |      |





------

