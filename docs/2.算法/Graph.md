# Graphs

[toc]

## 简介

### 概念

- 

### 适用范围

- 

### 复杂度

| 方法 | 复杂度 |
| ---- | ------ |
| DFS  | O(V+E) |
|      |        |
|      |        |

## 相关问题

1. 特定条件,区域块的个数 (DFS)

## 模板

### DFS

#### 基础

```java
visited[0...V-1] = false;

for(int v = 0; v < V; v ++)
    if(!visited[v])
      dfs(v);

dfs(int v){
   visited[v] = true;
   list.add(v);
   for(int w: adj(v))
      if(!visited[w])
         dfs(w);
}
```

#### 联通分量

```java
visited[0...V] = false;

for(int v = 0; v < V; v ++)
    if( !visited[v] && (****) ){
        dfs(v, list[i]);
        cccout ++;
}

dfs(int v, list){
     visited[w] = true;
     list.add(v);
     for(int w: adj(v))
         if(!visited[w]&& (****))
             dfs(w, list);
}
```

后写终止条件

```java
if (i < 0 || j < 0 || i > grid.length - 1 || j > grid[0].length - 1) {
    return;
}
if (visited[i][j]) {
    return;
}

visited[i][j] = true;

if (grid[i][j] == '1') {
    dfs(i - 1, j);
    dfs(i + 1, j);
    dfs(i, j - 1);
    dfs(i, j + 1);
}
```



### 单源路径

```java
visited[0...V-1] = false;
pre[0...V-1] = -1;
dfs(s, s);

dfs(int v, int parent){
     visited[v] = true;
     pre[v] = parent;
     for(int w: adj(v))
        if(!visited[w])
            dfs(w, v);
}
```



### 多源路径

```java
visited[0...V-1] = false;
pre[0...V-1] = -1;
dfs(s, s);

bool dfs(int v, int parent){
     visited[v] = true;
     pre[v] = parent;
     if(v == t) return true;
     for(int w: adj(v))
         if(!visited[w])
             if(dfs(w, v)) return true;
     return false;
}
```

### 环

```java
private Graph G;
private boolean[] visited;
private boolean hasCycle = false;

public CycleDetection(Graph G){

    this.G = G;
    visited = new boolean[G.V()];
    for(int v = 0; v < G.V(); v ++)
        if(!visited[v])
            if(dfs(v, v)){
                hasCycle = true;
                break;
            }
}

// 从顶点 v 开始，判断图中是否有环
private boolean dfs(int v, int parent){

    visited[v] = true;
    for(int w: G.adj(v))
        if(!visited[w]){
            if(dfs(w, v)) return true;
        }
        else if(w != parent)
            return true;
    return false;
}
```



### 染色

```java
private boolean[] visited;
private int[] colors;
private boolean isBipartite = true;

public BipartitionDetection(Graph G){

    this.G = G;
    visited = new boolean[G.V()];
    colors = new int[G.V()];
    for(int i = 0; i < G.V(); i ++)
        colors[i] = -1;

    for(int v = 0; v < G.V(); v ++)
        if(!visited[v])
            if(!dfs(v, 0)){
                isBipartite = false;
                break;
            }
}

private boolean dfs(int v, int color){

    visited[v] = true;
    colors[v] = color;
    for(int w: G.adj(v))
        if(!visited[w]){
            if(!dfs(w, 1 - color)) return false;
        }
        else if(colors[w] == colors[v])
            return false;
    return true;
}
```





------

