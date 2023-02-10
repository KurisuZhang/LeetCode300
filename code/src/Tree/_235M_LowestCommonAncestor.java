package Tree;

import Tools.ListNode;
import Tools.TreeNode;

public class _235M_LowestCommonAncestor {

    TreeNode result;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);
        return result;
    }

    public void dfs(TreeNode root, TreeNode p, TreeNode q) {

        if (p.val > root.val && q.val > root.val) {
            dfs(root.right, p, q);
        } else if (p.val < root.val && q.val < root.val) {
            dfs(root.left, p, q);
        } else {
            result = root;
        }
    }


}
