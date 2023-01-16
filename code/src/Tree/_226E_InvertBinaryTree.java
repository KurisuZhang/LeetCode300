package Tree;

import Tools.TreeNode;

public class _226E_InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {

        if(root == null){
            return null;
        }

        TreeNode leftNode = invertTree(root.left);
        TreeNode rightNode = invertTree(root.right);

        root.left = rightNode;
        root.right = leftNode;

        return root;
    }
}
