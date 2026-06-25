package Week_4.Day_3;

class LCA {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return find(root,p,q);

        
    }
    public TreeNode find(TreeNode node, TreeNode p, TreeNode q){
        if(node==null) return null;

        TreeNode left = find(node.left, p, q);
        TreeNode right = find(node.right, p, q);
        TreeNode self = (node==p || node==q)? node:null;

        if(left!=null && right!=null) return node;
        if((left!=null || right!=null) && self!=null) return node;
        if(self!=null) return self;

        return (left!=null) ? left : right; 
    }
}