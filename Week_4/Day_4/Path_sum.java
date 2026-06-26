package Week_4.Day_4;

class Path_sum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        return path(root,targetSum);
        
    }
    public boolean path(TreeNode root, int sum) {
        if(root==null ) return false;
        
        if(root.left==null && root.right==null) {
            return sum==root.val;
        }

        int val = root.val;
        return path(root.left, sum-val) || path(root.right, sum-val);
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}