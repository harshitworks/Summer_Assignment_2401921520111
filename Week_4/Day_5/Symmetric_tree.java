package Week_4.Day_5;


class Symmetric_tree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSameTree(root.left, root.right);

    }

    public boolean isSameTree(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        else if (t1 == null && t2 != null) return false;
        else if (t1 != null && t2 == null) return false;
        else if (t1.val != t2.val) return false;

        return isSameTree(t1.left, t2.right) && isSameTree(t1.right, t2.left);

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}