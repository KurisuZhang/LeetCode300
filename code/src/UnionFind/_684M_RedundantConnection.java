package UnionFind;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _684M_RedundantConnection {
    public static int[] findRedundantConnection(int[][] edges) {

        UF uf = new UF(edges.length);

        for (int[] edge : edges) {
            if (!uf.union(edge[0], edge[1])) {
                return edge;
            }
        }
        return new int[]{};
    }


    private static class UF{
        int[] parent;
        int[] rank;

        public UF(int size) {
            parent = new int[size+1];
            rank = new int[size+1];
            for (int i = 1; i < size+1; i++) {
                parent[i] = i;
            }
            Arrays.fill(rank, 1);
        }

        public int find(int e) {

            while (e != parent[e]) {
                e = parent[e];
            }
            return e;
        }

        public boolean find(int p, int q) {
            return find(p) == find(q);
        }

        public boolean union(int p, int q) {

            int rootP = find(p);
            int rootQ = find(q);

            if (rootP == rootQ) {
                return false;
            }

            if (rank[rootP] > rank[rootQ]) {
                parent[rootQ] = rootP;
            } else if (rank[rootQ] > rank[rootP]) {
                parent[rootP] = rootQ;
            } else {
                parent[rootQ] = rootP;
                rank[rootP] += 1;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        int[][] nums = new int[][]{{1, 4}, {3, 4}, {1, 3},{1,2},{4,5}};
        System.out.println(findRedundantConnection(nums));

    }


}
