# dp



## [2272. Substring With Largest Variance](https://leetcode.com/problems/substring-with-largest-variance/)

```java
if (s.charAt(k) == i) {
    dp1 = Math.max(dp1, 0) + 1;
    dp2 = dp2 + 1;
} else if (s.charAt(k) == j) {
    dp2 = Math.max(dp1, 0) - 1;
    dp1 = Math.max(dp2, 0);
}
```

