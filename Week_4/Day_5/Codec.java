package Week_4.Day_5;
import java.util.*;

public class Codec {

    // Encodes a tree to a single string.
    public List<String> serialize(TreeNode root) {
        List<String> list = new ArrayList<>();
        helper(root, list);
        return list;
    }
    public void helper(TreeNode root, List<String> list) {
        if(root==null) {
            list.add("null");
            return;
        }
        list.add(String.valueOf(root.val));
        helper(root.left, list);
        helper(root.right, list);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(List<String> list) {
        return helper2(list.reversed());
        
    }
    public TreeNode helper2(List<String> list) {
        if(list==null || list.isEmpty()) {
            return null;
        }
        String s = list.removeLast();
        if(s.equals("null")) {
            return null;
        }
        int val = Integer.parseInt(s);
        TreeNode root = new TreeNode(val);
        root.left=helper2(list);
        root.right=helper2(list);

        return root;
    }
}