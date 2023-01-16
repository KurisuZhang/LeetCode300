package Tree;

import Tools.TreeNode;

public class _543E_DiameterofBinaryTree {

    int maxDiameter=0;

    public int diameterOfBinaryTree(TreeNode root) {
        int longestPath = 0;
        Dfs(root, longestPath);
        return maxDiameter;
    }

    private int Dfs(TreeNode root, int longestPath) {
        if (root==null){
            return 0;
        }

        int longestLeft = Dfs(root.left,longestPath);
        int longestRight = Dfs(root.right, longestPath);

        maxDiameter = Math.max(maxDiameter, (longestLeft + longestRight));

        return Math.max(longestLeft, longestRight) + 1;
    }


}
