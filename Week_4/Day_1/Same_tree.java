package Week_4.Day_1;

class Same_tree {
    public boolean isSameTree(TreeNode t1, TreeNode t2) {
        if(t1==null && t2==null) return true;
        else if(t1==null && t2!=null) return false;
        else if(t1!=null && t2==null) return false;
        else if(t1.val!=t2.val) return false;

        return isSameTree(t1.left, t2.left) && isSameTree(t1.right, t2.right);
        
    }
}