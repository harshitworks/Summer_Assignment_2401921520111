package Week_4.Day_1;

public class Invert {
    public TreeNode invertTree(TreeNode root) {
        return swap(root);

    }
    public TreeNode swap(TreeNode node) {
        if(node==null) {
            return null;
        }
        swap(node.left);
        swap(node.right);
        TreeNode temp = null;
        temp = node.left;
        node.left = node.right;
        node.right = temp;
        return node;
    }
}
