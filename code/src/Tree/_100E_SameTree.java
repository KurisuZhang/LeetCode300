package Tree;

import Tools.TreeNode;

public class _100E_SameTree {

    boolean ans = true;

    public boolean isSameTree(TreeNode p, TreeNode q) {
        dfs(p, q);
        return ans;
    }

    private void dfs(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return;
        }

        if (p == null || q == null) {
            ans = false;
            return;
        }

        if (p.val != q.val){
            ans = false;
        }

        dfs(p.left, q.left);
        dfs(p.right, q.right);
    }
}
