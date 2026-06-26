package Week_4.Day_5;

import java.util.*;
class Construct_tree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int[] index = new int[]{0};

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return build2(preorder, inorder, 0, inorder.length, index, map);
    }

    public TreeNode build2(int[] preorder, int[] inorder, int left, int right, int[] index, HashMap<Integer, Integer> map) {
        if (left > right) return null;
        if (index[0] >= inorder.length) return null;

        int val = preorder[index[0]++];
        int currIndex = map.get(val);


        TreeNode node = new TreeNode(val);
        node.left = build2(preorder, inorder, left, currIndex - 1, index, map);
        node.right = build2(preorder, inorder, currIndex + 1, right, index, map);

        return node;


    }
}