package Week_4.Day_4;

class Diameter {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
      path(root);
      return max;
        
    }
    public int path(TreeNode node ){
        if(node==null) return 0;
        int left = path(node.left);
        int right= path(node.right);
        int ans =  left + right ;
        max = Math.max(max,ans);
        return Math.max(left,right)+1;
    }
}