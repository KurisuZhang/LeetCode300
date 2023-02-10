package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _133M_CloneGraph {

    private class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    HashMap<Integer, Node> hashMap;
    Node copy;
    Node currents;

    public Node cloneGraph(Node node) {

        if (node == null) {
            return null;
        }
        hashMap = new HashMap<>();
        copy = new Node(node.val);
        currents = node;
        //  只有一条路径
        dfs(currents, copy);
        return copy;
    }

    public void dfs(Node currents, Node copy) {

        hashMap.put(copy.val, copy);

        for (Node current : currents.neighbors) {

            if (!hashMap.containsKey(current.val)) {
                Node newNode = new Node(current.val);
                copy.neighbors.add(newNode);
                dfs(current, newNode);
            } else {
                copy.neighbors.add(hashMap.get(current.val));
            }
        }
    }
}
