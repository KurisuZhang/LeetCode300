package Tree;

import Tools.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class _94E_BinaryTreeInorderTraversal {

    List<Integer> list;

    public List<Integer> inorderTraversal(TreeNode root) {
        list = new LinkedList<>();
        recursion(root);
        return list;
    }

    public void recursion(TreeNode root){
        if (root == null){
            return;
        }
        recursion(root.left);
        list.add(root.val);
        recursion(root.right);
    }
}
