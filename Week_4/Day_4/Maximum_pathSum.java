package Week_4.Day_4;

class Maximum_pathSum {
    int ans = Integer.MIN_VALUE ;
    public int maxPathSum(TreeNode root) {
        harshit(root);
        return ans;
    }
    
    public int harshit(TreeNode root) {
        if(root==null) return 0 ;

        int left = harshit(root.left);
        int right = harshit(root.right);
        // ignore the negatives 
        if(left<0) left = 0 ;
        if(right<0) right = 0 ;
        ans = Math.max(ans,left+right+root.val);
        return root.val+ Math.max(left, right);
    }
}