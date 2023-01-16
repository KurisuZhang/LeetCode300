package Tree;

import Tools.TreeNode;

public class _104E_MaximumDepthofBinaryTree {

    int maxDepth = 0;

    public int maxDepth(TreeNode root) {
        int currentDepth=0;

        Dfs(root, currentDepth);

        return maxDepth;
    }

    private void Dfs(TreeNode root, int currentDepth) {

        maxDepth = Math.max(currentDepth, maxDepth);

        if (root == null){
            return;
        }

        Dfs(root.left,currentDepth+1);
        Dfs(root.right, currentDepth+1);
    }
}
