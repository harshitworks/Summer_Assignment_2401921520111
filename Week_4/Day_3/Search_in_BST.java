package Week_4.Day_3;

class Search_in_BST {
    public TreeNode searchBST(TreeNode root, int val) {
        return find(root, val);
    }
    public TreeNode find(TreeNode node , int val) {
        if(node==null) return null;

        if(node.val==val) return node;

        TreeNode ans = null;
        if(val<node.val) { // left-subtree
            TreeNode temp = find(node.left , val);
            if(temp!=null) ans = temp;
            
        }
        else {
            TreeNode temp = find(node.right , val);
            if(temp!=null) ans = temp;

        }
        return ans;
      
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