package Week_4.Day_3;

class Validate_BST {
    public boolean isValidBST(TreeNode root) {
        long min = Long.MIN_VALUE;
        long max = Long.MAX_VALUE;
        
        return check(root, min, max);
        
    }
    public boolean check(TreeNode node, long min,  long max ) {
        if(node==null) return true;

        if(node.val<= min || node.val>= max) return false;
        

        return check(node.left, min, node.val ) && check(node.right,node.val, max);


    }
}