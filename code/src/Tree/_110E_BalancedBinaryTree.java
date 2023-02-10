package Tree;

import Tools.TreeNode;

public class _110E_BalancedBinaryTree {


    Boolean ans = true;

    public boolean isBalanced(TreeNode root) {
        Dfs(root);
        return ans;
    }

    private int Dfs(TreeNode root) {

        if (root==null){
            return 0;
        }

        int leftDepth = Dfs(root.left);
        int rightDepth = Dfs(root.right);

        if (Math.abs(leftDepth - rightDepth) > 1) {
            ans = false;
        }

        return Math.max(leftDepth, rightDepth) + 1;

    }
}
