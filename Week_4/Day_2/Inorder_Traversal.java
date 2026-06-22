package Week_4.Day_2;

import  java.util.*;

public class Inorder_Traversal {
    List<Integer> list ;
    public List<Integer> inorderTraversal(TreeNode root) {
        list = new ArrayList<>();
        traversal(root);
        return list;

    }
    public void traversal(TreeNode node) {
        if(node==null) return;

        traversal(node.left);
        list.add(node.val);
        traversal(node.right);
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

